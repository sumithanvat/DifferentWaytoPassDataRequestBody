package com.bridgelabz.SpringBoot_Employee.repository;

import com.bridgelabz.SpringBoot_Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
