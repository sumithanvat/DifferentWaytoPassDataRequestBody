package com.bridgelabz.SpringBoot_Employee.service;

import com.bridgelabz.SpringBoot_Employee.dto.EmployeeDTO;
import com.bridgelabz.SpringBoot_Employee.model.Employee;
import com.bridgelabz.SpringBoot_Employee.model.File;
import com.bridgelabz.SpringBoot_Employee.repository.EmployeeRepo;
import com.bridgelabz.SpringBoot_Employee.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class EmployeeService {

    @Autowired
    private FileRepo fileRepo;
    @Autowired
    private EmployeeRepo employeeRepo;
    public File addEmployee(MultipartFile file) throws IOException {
        System.out.println("File"+file.getBytes());
        File file1=new File(file.getOriginalFilename(), file.getBytes());
        return fileRepo.save(file1);
    }
    public Employee addEmployee1(EmployeeDTO employeeDTO) {
        Employee employeeData = new Employee(employeeDTO);
        return employeeRepo.save(employeeData);
    }
}
