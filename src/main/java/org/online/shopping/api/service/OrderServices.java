package org.online.shopping.api.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.online.shopping.api.commons.ErrorInfo;
import org.online.shopping.api.commons.OrderRequest;
import org.online.shopping.api.commons.OrderResponse;
import org.online.shopping.api.dao.OrderDAO;
import org.online.shopping.api.exception.OrderBusinessException;
import org.online.shopping.api.model.Catagory;
import org.online.shopping.api.model.Product;
import org.online.shopping.api.model.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class OrderServices {

	private Logger logger = LoggerFactory.getLogger(OrderServices.class);

	@Autowired
	private OrderDAO orderDao;

	private ObjectMapper mapper;

	public OrderResponse bookOrder(OrderRequest request) {
		mapper = new ObjectMapper();
		OrderResponse response = new OrderResponse();
		try {
			String inputRequest = mapper.writeValueAsString(request);
			logger.info("bookOrder Request {}" + inputRequest);
			Set<Product> products = request.getProducts();
			Catagory catagory = request.getCatagory();
			catagory.setProducts(products);
			Supplier supplier = request.getSupplier();
			supplier.setProducts(products);

			response = orderDao.saveOrder(catagory, supplier);
			String daoResponse = mapper.writeValueAsString(response);
			logger.info("Results getting from Dao " + daoResponse);
		} catch (OrderBusinessException | JsonProcessingException e) {
			logger.error(e.getLocalizedMessage());
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setError(false);
			errorInfo.setErrorMessage(e.getMessage());
			response.setErrorInfo(errorInfo);

		}
		return response;
	}
}
