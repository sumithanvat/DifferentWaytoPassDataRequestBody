package com.bridgelabz.SpringBoot_Employee.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$")
    public String name;
    public int age;
    @NotNull
    public double salary;
    public String email;


    }
