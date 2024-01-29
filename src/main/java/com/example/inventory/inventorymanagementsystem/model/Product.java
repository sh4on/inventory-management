package com.example.inventory.inventorymanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Serializable {

    private Long id;
    private String name;
    private double price;
    private int quantity;
    private Date manufacturingDate;
}
