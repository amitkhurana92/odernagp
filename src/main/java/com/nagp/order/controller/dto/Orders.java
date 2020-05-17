package com.nagp.order.controller.dto;

import java.io.Serializable;
import java.util.List;

import com.nagp.order.dto.OrderDto;

import lombok.Data;

@Data
public class Orders implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2214448733781387379L;
	private List<OrderDto> orders;

}
