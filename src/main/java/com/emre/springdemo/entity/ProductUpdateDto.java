package com.emre.springdemo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateDto {
    private String name;
    private double price;
    private int quantity;
}
