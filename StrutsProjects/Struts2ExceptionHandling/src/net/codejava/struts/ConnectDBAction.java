package net.codejava.struts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class ConnectDBAction extends ActionSupport {
	public String execute() throws SQLException, ClassNotFoundException {
		
		String databaseURL = "jdbc:mysql://localhost:3306/test?user=root&password=secret";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(databaseURL);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		
		return SUCCESS;
	}
}