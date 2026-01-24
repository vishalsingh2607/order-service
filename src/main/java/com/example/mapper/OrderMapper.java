package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.dto.OrderDTO;
import com.example.entity.Order;

@Mapper
public interface OrderMapper {

	  OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

	    Order mapOrderDTOToOrder(OrderDTO orderDTO);
	    OrderDTO mapOrderToOrderDTO(Order order);
}
