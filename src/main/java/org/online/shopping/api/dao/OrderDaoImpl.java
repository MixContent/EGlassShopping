package org.online.shopping.api.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.online.shopping.api.commons.OrderResponse;
import org.online.shopping.api.exception.OrderBusinessException;
import org.online.shopping.api.model.Catagory;
import org.online.shopping.api.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDAO {
	@Autowired(required = true)
	private SessionFactory factory;

	@Override
	public OrderResponse saveOrder(Catagory catagory, Supplier supplier)
			throws OrderBusinessException {
		OrderResponse response = new OrderResponse();
		if (catagory != null || supplier != null) {
			getSession().save(catagory);
			getSession().save(supplier);
			response.setFlag(Boolean.TRUE);
			response.setStatus("Success");
		} else {
			throw new OrderBusinessException("Invalid Order trying to persist");
		}
		return response;
	}

	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}

}
