package com.techlabs.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=root");
			System.out.println(con.getClass());
			System.out.println(con.getNetworkTimeout());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
