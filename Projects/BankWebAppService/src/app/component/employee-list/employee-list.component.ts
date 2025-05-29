import { Component, OnInit } from '@angular/core';
import { Employee } from '../../models/Employee';
import { EmployeeService } from '../../service/employee.service';

@Component({
  selector: 'app-employee-list',
  standalone: false,
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.css'
})
export class EmployeeListComponent implements OnInit{

  employee: Employee[] = [];

  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.getEmployee();
  }

  getEmployee(){
    this.employeeService.getEmployee().subscribe((e) => {
      this.employee = e;
    });
  }

  deleteEmployee(id: number): void {
    this.employeeService.deleteEmployee(id).subscribe(() => {
      this.employee = this.employee.filter(e => e.id !== id);
    });
  }
}
