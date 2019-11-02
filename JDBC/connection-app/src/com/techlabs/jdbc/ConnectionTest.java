package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) { 
  
        
		Connection con = null;
		try {
			DriverManager.setLoginTimeout(5);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
			System.out.println(con.getClass());
			//System.out.println(con.getNetworkTimeout());
			DriverManager.setLoginTimeout(5);
			
			System.out.println(con.getMetaData().getUserName());
			System.out.println(con.getMetaData().getCatalogs());
			System.out.println(con.getCatalog());
			System.out.println(DriverManager.getLoginTimeout());
			
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
