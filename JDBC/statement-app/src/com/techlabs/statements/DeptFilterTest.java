package com.techlabs.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeptFilterTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String number=sc.nextLine();
		String sql = "select * from DEPT where DEPTNO="+number+"";
		Connection con = null;
		try {
			DriverManager.setLoginTimeout(5);
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");

			Statement statement = con.createStatement();
			System.out.println(statement.executeQuery(sql));
			ResultSet results = statement.executeQuery(sql);
			while (results.next()) {
				System.out.println(results.getString(1)+","
						+results.getString(2)+","+results.getString(3));
			}
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
