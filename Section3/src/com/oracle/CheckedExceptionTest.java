package com.oracle;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckedExceptionTest {
	public void methodA() {
		FileInputStream fis = null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("");
			fis = new FileInputStream("namafile");
			fis.read();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				conn.close();
			} catch (IOException | SQLException e) {
				e.printStackTrace();
			}			
		}
	}
	public void methodB() {
		methodA();
	}
	public void methodC() {
		try (
			Connection conn = DriverManager.getConnection("");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("");
		) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new CheckedExceptionTest().methodB();
	}
}