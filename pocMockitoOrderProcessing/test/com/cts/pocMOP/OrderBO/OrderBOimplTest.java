package com.cts.pocMOP.OrderBO;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.cts.pocMOP.OrderBO.exception.BOException;
import com.cts.pocMOP.OrderDAO.OrderDAO;
import com.cts.pocMOP.OrderDTO.Order;

public class OrderBOimplTest {

	@Mock
	OrderDAO dao;
	private OrderBOimpl bo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		bo = new OrderBOimpl();
		bo.setDao(dao);
		// It will scan through all object which are marked @Mock
		// Here we are mocking/stubbing
	}

	@Test
	public void place_Order_Should_Create_An_Order() throws SQLException,
			BOException {

		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(1)); // Setting
															// expectations
		// 1 for true & 0 for false
		boolean result = bo.placeOrder(order);

		assertTrue(result);
		verify(dao).create(order);// Verifying, to check create method is
									// getting called or not

	}

	@Test
	public void place_Order_Should_Not_Create_An_Order() throws SQLException,
			BOException {

		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(0)); // Setting
															// expectations
		// 1 for true & 0 for false
		boolean result = bo.placeOrder(order);

		assertFalse(result);
		verify(dao).create(order);// Verifying, to check create method is
									// getting called or not

	}
	
	@Test(expected = BOException.class)
	public void place_Order_Should_Throw_BOException() throws SQLException,
			BOException {

		Order order = new Order();
		when(dao.create(order)).thenThrow(SQLException.class); // Setting
															// expectations
		boolean result = bo.placeOrder(order);


	}
	
	@Test
	public void cancelOrder_Should_Cancel_The_Order() throws SQLException, BOException
	{
		Order order = new Order();
		when(dao.read(123)).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		
		boolean result = bo.cancelOrder(123);
		
		assertTrue(result);
		verify(dao).read(123);
		verify(dao).update(order);
		
	}
	
	@Test
	public void cancelOrder_Should_Not_Cancel_The_Order() throws SQLException, BOException
	{ 
		Order order = new Order();
		when(dao.read(123)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		
		boolean result = bo.cancelOrder(123);
		
		assertFalse(result);
		verify(dao).read(123);
		verify(dao).update(order);
		
	}
	
	@Test(expected=BOException.class)
	public void cancelOrder_Should_Throw_BOException_OnRead() throws SQLException, BOException
	{
		Order order = new Order();
		when(dao.read(123)).thenThrow(SQLException.class);
		bo.cancelOrder(123);
	}
	
	@Test(expected=BOException.class)
	public void cancelOrder_Should_Throw_BOException_OnUpdate() throws SQLException, BOException
	{ 
		Order order = new Order();
		when(dao.read(123)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		
		bo.cancelOrder(123);
		
	}



}
