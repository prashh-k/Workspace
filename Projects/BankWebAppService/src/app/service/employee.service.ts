import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../models/Employee';

@Injectable({
  providedIn: 'root'
})

export class EmployeeService {

  backendUrl = "http://localhost:8080/employees";
  // backendUrl = "http://127.0.0.1:8000/api/employees";

  constructor(private http: HttpClient) { }

  // Fetch all employees
  getEmployee(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.backendUrl);
  }

  // Fetch an employee by ID
  getEmployeeById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.backendUrl}/getById/${id}`);
  }

  // Add a new employee
  addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(`${this.backendUrl}/add`, employee);
  }

  // Update an existing employee
  updateEmployee(id: number, employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.backendUrl}/update/${id}`, employee);
  }

  // Delete an employee
  deleteEmployee(id: number): Observable<void> {
    return this.http.delete<void>(`${this.backendUrl}/delete/${id}`);
  }

}
