package com.bridgelabz.SpringBoot_Employee.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "File_Table")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Lob
    @Column(length = 16777215)
    private byte[] fileData;

    public File(String fileName, byte[] fileData) {
        this.fileName = fileName;
        this.fileData = fileData;
    }
}
