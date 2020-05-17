package com.nagp.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.order.controller.dto.Orders;
import com.nagp.order.dto.OrderDto;
import com.nagp.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders/1")
	public ResponseEntity<Orders> getOrderDetails() {
		List<OrderDto> orderDtos = orderService.getOrderDetails();
		Orders orders = new Orders();
		orders.setOrders(orderDtos);
		return new ResponseEntity<>(orders, HttpStatus.OK);

	}
}
