package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementExample {

	public PreparedStatementExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
String inserQuary = "insert into employee (name, email, department, salary, joining_date)  ";
		 			
		  
		  try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","Mysql@123");
			  
			  PreparedStatement pstmt = con.prepareStatement(inserQuary);
			  pstmt.setString(1, "Priyesh");
			  pstmt.setString(2, "priyesh1@gmail.com");
			  pstmt.setString(3, "IT");
			  pstmt.setDouble(4, 15000.00);
			  pstmt.setString(5, "2023-03-15");
			  
			  pstmt.executeUpdate();
			  
			  System.out.println("insert success");
			  
		  } catch (Exception e) {
		  
			 e.printStackTrace();
		  }
		
	}
	
	
     /*   public static void main(String[] args) {
		 
		 String query = "select id, name, email, department, salary, joining_date from employee  where department = ?"; 
	
		 try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
			  
			  System.out.println("Connected to the database successfully");
		    
			  PreparedStatement pstmt = conn.prepareStatement(query);
			  pstmt.setString(1, "IT");
			  
		      ResultSet rs =  pstmt.executeQuery(); 
		      
		      while (rs.next()) {		    	  
		    	// if(rs.getInt("id") == 4)  // bad programming
				    System.out.println(rs.getInt("id")+" - "+rs.getString("name")+" - "+rs.getString("email")+" - "+rs.getString("department")+" - "+rs.getString("salary")+" - "+rs.getString("joining_date"));
			  }
			  
		 } catch (Exception e) {
			 
			  e.printStackTrace();
		 }
	 }  */
       
}
