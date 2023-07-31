package com.bridgelabz.SpringBoot_Employee.exception;

public class CustomException extends RuntimeException {
    public CustomException(String employee) {
        super(employee);
    }
}