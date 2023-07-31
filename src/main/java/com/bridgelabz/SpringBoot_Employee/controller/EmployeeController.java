package com.bridgelabz.SpringBoot_Employee.controller;

import com.bridgelabz.SpringBoot_Employee.dto.EmployeeDTO;
import com.bridgelabz.SpringBoot_Employee.dto.ResponseDTO;
import com.bridgelabz.SpringBoot_Employee.model.Employee;
import com.bridgelabz.SpringBoot_Employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping(value = "/addformdata", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ResponseDTO> addEmployee(@ModelAttribute  EmployeeDTO employeeDTO) throws IllegalArgumentException {
        Employee addedEmployee = employeeService.addEmployee(employeeDTO);
        log.info("form Data added Successfully");
        ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully", addedEmployee);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

//
@PostMapping("/addjson")
public ResponseEntity<ResponseDTO> addEmployee7(@Valid @RequestBody EmployeeDTO employeeDTO) {
    // Log that the data is added successfully.
    log.info("Data added Successfully");

    // Create a ResponseDTO with the success message and the data returned by the contactService.
    ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully", employeeService.addEmployee(employeeDTO));

    // Return the ResponseDTO with HttpStatus.CREATED (201 - Created) status code.
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
}


    @PostMapping("/addxml")
    public ResponseEntity<ResponseDTO> addEmployee3(@Valid @RequestBody EmployeeDTO employeeDTO) {
        log.info("Data added Successfully");
        ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully in xml format",employeeService.addEmployee(employeeDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    @PostMapping(value = "/addfiledata", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ResponseDTO> addEmployee4(@ModelAttribute  EmployeeDTO employeeDTO) throws IllegalArgumentException {
        Employee addedEmployee = employeeService.addEmployee(employeeDTO);
        log.info("Data added Successfully");
        ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully", addedEmployee);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}

