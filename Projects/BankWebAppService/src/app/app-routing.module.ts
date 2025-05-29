import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './component/employee-list/employee-list.component';
import { EmployeeAddEditComponent } from './component/employee-add-edit/employee-add-edit.component';

const routes: Routes = [
  {path:"",redirectTo:"empList",pathMatch:"full"},
  {path:"empList",component:EmployeeListComponent},
  { path: "employeeAddEdit", component: EmployeeAddEditComponent },
  { path: "employeeAddEdit/:id", component: EmployeeAddEditComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
