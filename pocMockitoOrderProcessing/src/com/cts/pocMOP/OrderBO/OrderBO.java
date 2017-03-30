package com.cts.pocMOP.OrderBO;

import com.cts.pocMOP.OrderBO.exception.BOException;
import com.cts.pocMOP.OrderDTO.Order;

public interface OrderBO {
	
	boolean placeOrder(Order order) throws BOException;
	
	boolean cancelOrder(int id) throws BOException;
	
	boolean deleteOrder(int id) throws BOException;
	
	

}
