package com.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {
	
	private List<FoodItemsDTO> foodItemsDTO;
	private Integer userId;
	private RestaurantDTO restaurantDTO;
}
