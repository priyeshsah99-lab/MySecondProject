package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public UpdateDemo() {
		// TODO Auto-generated constructor stub
	}
		public static void main(String[] args) {
			
			String name1 = "Anita d. Desai";
			String email = "anita.desai@example.com";
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","Mysql@123");
				
				PreparedStatement ps = con.prepareStatement("update employee set name=? where email=?");
				ps.setString(1, name1);
				ps.setString(2, email);
				
				ps.executeUpdate();
				
				System.out.println("update succesfulyy");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		} 
}
