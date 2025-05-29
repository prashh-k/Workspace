import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../../service/employee.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employee-add-edit',
  standalone: false,
  templateUrl: './employee-add-edit.component.html',
  styleUrl: './employee-add-edit.component.css'
})

export class EmployeeAddEditComponent implements OnInit {

  employeeForm!: FormGroup;
  employeeId?: number;

  constructor(
    private fb: FormBuilder,
    private employeeService: EmployeeService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.employeeForm = this.fb.group({
      id: [null],
      name: ['', Validators.required],
      age: ['', [Validators.required, Validators.min(18)]],
      gender: ['', Validators.required]
    });

    // Check if updating an employee
    this.route.paramMap.subscribe(params => {
      const id = Number(params.get('id'));
      if (id) {
        this.employeeId = id;
        this.employeeService.getEmployeeById(id).subscribe(employee => {
          this.employeeForm.patchValue(employee);
        });
      }
    });
  }

  submitForm(): void {
    if (this.employeeId) {
      this.employeeService.updateEmployee(this.employeeId, this.employeeForm.value).subscribe(() => {
        this.router.navigate(['/empList']);
      });
    } else {
      this.employeeService.addEmployee(this.employeeForm.value).subscribe(() => {
        this.router.navigate(['/empList']);
      });
    }
  }
}