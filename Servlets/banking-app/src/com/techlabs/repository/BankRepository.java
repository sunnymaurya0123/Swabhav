package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;

public class BankRepository {

	private Connection con = null;

	public void addAccount(BankMaster bankMaster, BankTransaction bankTransaction) {
		getConnection();
		try {
			con.setAutoCommit(false);

			PreparedStatement statement1 = con.prepareStatement("insert into bankmaster values(?,?,?)");
			statement1.setString(1, bankMaster.getName());
			statement1.setString(2, bankMaster.getPassword());
			statement1.setDouble(3, bankMaster.getBalance());
			statement1.executeUpdate();

			PreparedStatement statement2 = con.prepareStatement("insert into banktxn values(?,?,?,?)");
			statement2.setString(1, bankTransaction.getName());
			statement2.setDouble(2, bankTransaction.getAmount());
			statement2.setString(3, bankTransaction.getType());
			statement2.setDate(4, bankTransaction.getDate());
			statement2.executeUpdate();

			con.commit();
			System.out.println("Added to Bank Master");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			if (con != null) {
				System.out.println("NOT NULL");
				return con;
			} else
				System.out.println("NULL");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean validate(String userName, String password) {
		getConnection();
		String dbUserName, dbPassword;
		boolean login = false;
		try {
			Statement statement = con.createStatement();
			statement.executeQuery("select name,pswd from bankmaster;");
			ResultSet rs = statement.getResultSet();
			while (rs.next()) {
				dbUserName = rs.getString(1);
				dbPassword = rs.getString(2);

				if (dbUserName.equals(userName) && dbPassword.equals(password))
					login = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return login;
	}

	public double getUserBalance(String userName) {
		getConnection();
		double userBal = 0;
		try {
			Statement statement = con.createStatement();
			statement.executeQuery("select balance from bankmaster where name='" + userName + "'");
			ResultSet rs = statement.getResultSet();
			if (rs.next())
				userBal = rs.getDouble(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userBal;
	}

	public void updateAccount(BankTransaction bankTransaction) {
		getConnection();
		String sql = null;
		try {
			con.setAutoCommit(false);

			if (bankTransaction.getType().equals("D")) {
				sql = "update bankmaster set balance=balance+? where name=?";
			}
			if (bankTransaction.getType().equals("W")) {
				sql = "update bankmaster set balance=balance-? where name=?";
			}
			PreparedStatement statement1 = con.prepareStatement(sql);
			statement1.setDouble(1, bankTransaction.getAmount());
			statement1.setString(2, bankTransaction.getName());
			statement1.executeUpdate();

			PreparedStatement statement2 = con.prepareStatement("insert into banktxn values(?,?,?,?)");
			statement2.setString(1, bankTransaction.getName());
			statement2.setDouble(2, bankTransaction.getAmount());
			statement2.setString(3, bankTransaction.getType());
			statement2.setDate(4, bankTransaction.getDate());
			statement2.executeUpdate();

			con.commit();
			System.out.println("Added to Bank Master");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<BankTransaction> get(String userName) {
		getConnection();
		List<BankTransaction> passbookList = new ArrayList<BankTransaction>();
		BankTransaction bankTransaction;
		try {
			PreparedStatement statement = con.prepareStatement("select * from banktxn where name=?");
			statement.setString(1, userName);
			ResultSet results = statement.executeQuery();
			
			if (results.next())
				do {
//					System.out.println(results.getInt(1) + "," + results.getString(2) + "," + results.getString(3) + ","
//							+ results.getString(4) + "," + results.getString(5));
					bankTransaction = new BankTransaction(results.getString(1), results.getDouble(2), results.getString(3),
							results.getDate(4));
					passbookList.add(bankTransaction);

				} while (results.next());
			else
				System.out.println("Record Not Found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return passbookList;
	}

}
