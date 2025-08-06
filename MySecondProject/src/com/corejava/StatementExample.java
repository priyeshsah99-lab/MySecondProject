  

package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementExample {
 
	/* public static void main(String[] args) {
		 
		 String inserQuary = "insert into employee (name, email, department, salary, joining_date) "
		 		+ " values('Rahul Verma', 'rahul.verma@example.com', 'IT', 55000.00, '2022-01-15') ";
	
		 try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			 
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
			
			  System.out.println("Connected to the database successfully");
			  
		      Statement stmt = conn.createStatement();
		      
		      int count = stmt.executeUpdate(inserQuary);
		      
		      System.out.println("count : "+count);
			  
		 } catch (Exception e) {
			 
			  e.printStackTrace();
			  
		 }
	 }*/
	 
     public static void main(String[] args) {
		 
		 String quary = "select id, name, email, department, salary, joining_date from employee "; // where id = 1
	
		 try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
			  System.out.println("Connected to the database successfully");
		      Statement stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(quary);
		      
		      while (rs.next()) {		    	  
		    	// if(rs.getInt("id") == 4)  // bad programming
				    System.out.println(rs.getInt("id")+" - "+rs.getString("name")+" - "+rs.getString("email")+" - "+rs.getString("salary")+" - "+rs.getString("joining_date"));
			  }
			  
		 } catch (Exception e) {
			 
			  e.printStackTrace();
		 }
	 }
}
