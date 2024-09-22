package com.CarRental.dto;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

import lombok.Data;

public class CarDto {

    private Long id;

    private String brand;

    private String color;

    private String name;

    private String type;

    private String transmission;

    private String description;

    private Date year;

    private Long price;

    private byte[] image;


    @Column(columnDefinition = "longblob")
    private MultipartFile returnedImage;
    
}