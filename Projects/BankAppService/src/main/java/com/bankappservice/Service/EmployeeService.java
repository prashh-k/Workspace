package com.bankappservice.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankappservice.Entity.Employee;
import com.bankappservice.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    private static final Logger logger = LogManager.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        logger.info("Fetching all employees");
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        logger.info("Fetching employee by ID: {}", id);
        return employeeRepository.findById(id).orElseThrow(() -> {
            logger.error("Employee not found with ID: {}", id);
            return new RuntimeException("Employee not found");
        });
    }

    public Employee createEmployee(Employee employee) {
        logger.info("Creating new employee: {}", employee.getName());
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        logger.info("Updating employee with ID: {}", id);
        Employee employee = getEmployeeById(id);
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setDepartment(employeeDetails.getDepartment());
        Employee updatedEmployee = employeeRepository.save(employee);
        logger.info("Updated employee with ID: {}", id);
        return updatedEmployee;
    }

    public void deleteEmployee(Long id) {
        logger.info("Deleting employee with ID: {}", id);
        try {
            employeeRepository.deleteById(id);
            logger.info("Deleted employee with ID: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting employee with ID: {}", id, e);
            throw e;
        }
    }
}
