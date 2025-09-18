package com.cartservice.dto;

import lombok.Data;

@Data
public class ProductResponse {
	
	private Long id;
    private String name;
    private double price;
    private int stock;
}
