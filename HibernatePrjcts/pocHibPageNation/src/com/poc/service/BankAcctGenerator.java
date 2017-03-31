package com.poc.service;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentityGenerator;

 	 	
public class BankAcctGenerator extends IdentityGenerator{
	
	@Override
	public Serializable generate(SessionImplementor s, Object obj) {
		// Get next sequence value and append it to Bank Name(HDFC)
		// And Send it to table 
		String name = "HDFC000";
		Connection con = s.connection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select USR_ACCT_NO from HDFC_USR_INFO order by USR_ACCT_NO DESC");
			if(rs.next()){
				name = name+rs.getInt(1);
			}
		} catch (SQLException e) {
			return name;
		}
		
		return name;
	}
}
