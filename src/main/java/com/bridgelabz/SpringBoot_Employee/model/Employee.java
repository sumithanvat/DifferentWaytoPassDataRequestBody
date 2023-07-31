package com.bridgelabz.SpringBoot_Employee.model;

import com.bridgelabz.SpringBoot_Employee.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private double salary;
    private String email;
    public Employee (EmployeeDTO employeeDTO){
        this.name = employeeDTO.getName();
        this.age = employeeDTO.getAge();
        this.salary = employeeDTO.getSalary();
        this.email = employeeDTO.getEmail();

    }

}
