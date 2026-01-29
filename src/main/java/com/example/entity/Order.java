package com.example.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.dto.FoodItemsDTO;
import com.example.dto.Restaurant;
import com.example.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
	
	private Integer userId;
	private List<FoodItemsDTO> foodItemsList;
	private Restaurant restaurant;
	private UserDTO userDTO;

}
