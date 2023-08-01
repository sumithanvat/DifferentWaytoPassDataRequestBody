package com.bridgelabz.SpringBoot_Employee.repository;

import com.bridgelabz.SpringBoot_Employee.model.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepo extends JpaRepository<File,Long> {
}
