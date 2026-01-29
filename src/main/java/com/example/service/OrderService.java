package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.OrderDTO;
import com.example.dto.OrderDTOFromFE;
import com.example.dto.UserDTO;
import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import com.example.repo.OrderRepo;

@Service
public class OrderService {

	 @Autowired
	 OrderRepo orderRepo;
	   
	@Autowired
	SequenceGenerator sequenceGenerator;
	
	@Autowired
	RestTemplate restTemplate;

	public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
		Integer newOrderID = sequenceGenerator.generateNextOrderId();
		UserDTO userDTO = fetchUserDetailsFromUserId(orderDetails.getUserId());
		 Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), 
				 										orderDetails.getRestaurant(), userDTO );
		 System.out.println("orderToBeSaved "+orderToBeSaved);
		 orderRepo.save(orderToBeSaved);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
	}
	
	  private UserDTO fetchUserDetailsFromUserId(Integer userId) {
	       return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/" + userId, UserDTO.class);
	    }

}
