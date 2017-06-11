package org.online.shopping.api.dao;

import org.online.shopping.api.commons.OrderResponse;
import org.online.shopping.api.exception.OrderBusinessException;
import org.online.shopping.api.model.Catagory;
import org.online.shopping.api.model.Supplier;

public interface OrderDAO {
	public OrderResponse saveOrder(Catagory catagory, Supplier supplier)
			throws OrderBusinessException;
}
