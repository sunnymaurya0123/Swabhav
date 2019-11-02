package com.techlabs.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {

        String sql = "select * from DEPT ";
		Connection con = null;
		try {
			DriverManager.setLoginTimeout(5);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
			
			Statement statement=con.createStatement();
			System.out.println(statement.executeQuery(sql));
			
			ResultSet results=statement.executeQuery(sql);
			while(results.next()!=false) {
				System.out.println(results.getString(1)+","
						+results.getString(2)+","+results.getString(3));
			}
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
