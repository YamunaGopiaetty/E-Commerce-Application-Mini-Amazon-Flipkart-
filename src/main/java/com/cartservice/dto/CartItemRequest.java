package com.cartservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemRequest {

	@NotNull(message ="ProductId is required")
	private Long productId;
	
	@NotNull(message ="Quantity is required")
	@Min(value =1,message = "Quantity must be atleast 1 ")
	private Integer quantity;
}
