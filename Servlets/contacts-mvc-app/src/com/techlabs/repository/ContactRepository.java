package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactRepository {
	private Connection con = null;

	public ContactRepository() {

	}

	public List<Contact> get() {
		getConnection();
		List<Contact> contactList = new ArrayList<Contact>();
		Contact contact;
		try {
			PreparedStatement statement = con.prepareStatement("select * from Contact");
			ResultSet results = statement.executeQuery();
			if (results.next())
				do {
					System.out.println(results.getString(1) + "," + results.getString(2) + "," + results.getString(3)
							+ "," + results.getString(4) + "," + results.getInt(5));
					contact = new Contact(results.getString(2), results.getString(3), results.getString(4),
							results.getInt(5));
					contactList.add(contact);

				} while (results.next());
			else
				System.out.println("Record Not Found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contactList;
	}

	public void add(Contact contact) {
		getConnection();
		try {
			
			PreparedStatement statement = con
					.prepareStatement("insert into Contact(FirstName,LastName,Email_Id,phone_No) " + "values(?,?,?,?)");
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());
			statement.setString(3, contact.getEmailId());
			statement.setInt(4, contact.getPhoneNo());
			statement.executeUpdate();
			System.out.println("Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
