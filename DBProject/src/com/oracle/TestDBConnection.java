package com.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBConnection {
	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String username = "app";
		String password = "app";
		String dburl = "jdbc:derby://localhost:1527/sample";
		String query = "SELECT * FROM CUSTOMER";
		// Register Driver
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (
			Connection conn = DriverManager.getConnection(dburl, username, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
		) {
			while(rs.next()) {
				String nama = rs.getString("CUST_NAME");
				System.out.println(nama);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}