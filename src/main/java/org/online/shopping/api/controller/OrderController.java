package org.online.shopping.api.controller;

import org.online.shopping.api.commons.OrderRequest;
import org.online.shopping.api.commons.OrderResponse;
import org.online.shopping.api.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderServices services;

	@RequestMapping(value = "/addOrder")
	public OrderResponse saveOrders(@RequestBody OrderRequest request) {
		return services.bookOrder(request);
	}
}
