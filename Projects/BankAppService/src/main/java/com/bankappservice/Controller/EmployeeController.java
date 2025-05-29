package com.bankappservice.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankappservice.Entity.Employee;
import com.bankappservice.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
       return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        logger.info("GET /employees/{} - Fetching employee by ID", id);
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        logger.info("POST /employees - Creating new employee: {}", employee.getName());
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        logger.info("PUT /employees/{} - Updating employee", id);
        return employeeService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        logger.info("DELETE /employees/{} - Deleting employee", id);
        employeeService.deleteEmployee(id);
    }
}
