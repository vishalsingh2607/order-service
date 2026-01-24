package com.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

	private Integer userId;
	private List<FoodItemsDTO> foodItemsDTO;
	private RestaurantDTO restaurantDTO;
	private UserDTO userDTO;
}
