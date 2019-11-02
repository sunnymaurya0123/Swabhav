package com.techlabs.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		Connection con = null;
		try {
			DriverManager.setLoginTimeout(5);
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");

			PreparedStatement statement = con.prepareStatement("select * from DEPT where DEPTNO=?");
			statement.setInt(1, number);
			ResultSet results = statement.executeQuery();
			if (results.next())
				do {
					System.out.println(results.getString(1) + "," + results.getString(2) + "," + results.getString(3));
				} while (results.next());
			else
				System.out.println("Record Not Found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
