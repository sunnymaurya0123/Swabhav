package com.techlabs.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			
			con.setAutoCommit(false);
			
			PreparedStatement statement1 = con.prepareStatement("update customer1 set balance=balance-5000 where customer_id=?;");
			statement1.setInt(1, 3);
			statement1.executeUpdate();
			
			PreparedStatement statement2 = con.prepareStatement("update merchants set balance=balance+5000 where merchant_id=?;");
			statement2.setInt(1, 3);
			statement2.executeUpdate();
			
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}