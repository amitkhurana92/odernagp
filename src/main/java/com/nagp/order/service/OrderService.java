package com.nagp.order.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagp.order.dto.OrderDto;

@Service
public class OrderService {

	public List<OrderDto> getOrderDetails() {

		List<OrderDto> orderDtos = new ArrayList<>();

		OrderDto dto = new OrderDto();
		dto.setOrderId(1);
		dto.setOrderAmount(250);
		dto.setOrderDate(LocalDate.of(2020, Month.APRIL, 14));
		orderDtos.add(dto);

		dto = new OrderDto();
		dto.setOrderId(2);
		dto.setOrderAmount(450);
		dto.setOrderDate(LocalDate.of(2020, Month.APRIL, 15));
		orderDtos.add(dto);

		return orderDtos;
	}
}
