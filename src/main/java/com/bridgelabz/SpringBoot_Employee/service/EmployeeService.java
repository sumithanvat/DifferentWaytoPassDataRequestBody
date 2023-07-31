package com.bridgelabz.SpringBoot_Employee.service;

import com.bridgelabz.SpringBoot_Employee.dto.EmployeeDTO;
import com.bridgelabz.SpringBoot_Employee.model.Employee;
import com.bridgelabz.SpringBoot_Employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employeeData = new Employee(employeeDTO);
        return employeeRepo.save(employeeData);
    }
}
