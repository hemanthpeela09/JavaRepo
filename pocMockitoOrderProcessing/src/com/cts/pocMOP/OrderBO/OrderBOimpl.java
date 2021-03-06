package com.cts.pocMOP.OrderBO;

import java.sql.SQLException;

import com.cts.pocMOP.OrderBO.exception.BOException;
import com.cts.pocMOP.OrderDAO.OrderDAO;
import com.cts.pocMOP.OrderDTO.Order;

public class OrderBOimpl implements OrderBO {

	private OrderDAO dao;

	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	public boolean cancelOrder(int id) throws BOException {
		try {
			Order order = dao.read(id);
			order.setStatus("cancel");
			int result = dao.update(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}

		return true;
	}

	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}

		return true;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
