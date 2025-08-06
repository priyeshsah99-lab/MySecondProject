package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementExcopy {

	public PreparedStatementExcopy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[]args) {
		
	String inserQuary = "insert into employee(name, email, department, salary, joining_date)"
			+ " values(?, ?, ?, ?, ?) ";
	    
	 try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","Mysql@123");
		    
		    PreparedStatement psmt = conn.prepareStatement(inserQuary);
		    psmt.setString(1, "Vinay");
		    psmt.setString(2, "Vinay1@gmail.com");
		    psmt.setString(3, "IT");
		    psmt.setString(4, "20000.20");
		    psmt.setString(5,"2025-04-15");
		    
		    psmt.executeUpdate();
		    
		    System.out.println("insert succes");
	    	
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	} 
	
/*	public static void main(String[]args) {
		
		String query = "select id, name, email, department, salary, joining_date from employee where name = ?";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
			
			System.out.println("Connected to the successfully");
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "Vinay");
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email")+" "+rs.getString("department")+" "+
			rs.getString("joining_date"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} */
		
	
}
