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

	public List<Contact> get() {
		getConnection();
		List<Contact> contactList = new ArrayList<Contact>();
		Contact contact;
		try {
			PreparedStatement statement = con.prepareStatement("select * from Contact");
			ResultSet results = statement.executeQuery();
			
			if (results.next())
				do {
					System.out.println(results.getInt(1) + "," + results.getString(2) + "," + results.getString(3) + ","
							+ results.getString(4) + "," + results.getString(5));
					contact = new Contact(results.getInt(1), results.getString(2), results.getString(3),
							results.getString(4), results.getString(5));
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
			statement.setString(4, contact.getPhoneNo());
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

	public Contact get(int id) {
		for (Contact contact : get()) {
			if (contact.getId() == id)
				return contact;
		}
		return null;
	}

	public void edit(int id, Contact contact) {
		getConnection();
		try {

			PreparedStatement statement = con
					.prepareStatement("update Contact set FirstName=?,LastName=?,Email_Id=?,phone_No=? where contact_id=?");
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());
			statement.setString(3, contact.getEmailId());
			statement.setString(4, contact.getPhoneNo());
			statement.setInt(5, id);
			statement.executeUpdate();
			System.out.println("Edited");
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

	public void remove(int contactId) {
		getConnection();
		try {

			PreparedStatement statement = con
					.prepareStatement("delete from Contact where contact_id=?");
			statement.setInt(1, contactId);
			statement.executeUpdate();
			System.out.println("Deleted");
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

}
