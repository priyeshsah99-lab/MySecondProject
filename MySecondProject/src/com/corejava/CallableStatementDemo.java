package com.corejava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementDemo {

	public CallableStatementDemo() {
		// TODO Auto-generated constructor stub
	}
    
/*	public static void main(String[]args) {
		
		try {  
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root", "Mysql@123");
			
			
			System.out.println("connected succesfully");
			
			CallableStatement cstmt = conn.prepareCall("{call myProcedure(?, ?, ?, ?, ?)}");
			
			cstmt.setString(1,"Rahul varma");
			cstmt.setString(2, "rahul02.verma@example.com");
			cstmt.setString(3, "IT");
			cstmt.setString(4, "25000.00");
			cstmt.setString(5, "2023-03-15");
			
			cstmt.execute();
			
			
			System.out.println("succeses");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
	} */
	
	 public static void main(String[]args) {
		 
		
		
		  String query = "{CALL NameAndEmail(?,?)}";

		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
		
		System.out.println("Connected to the database succesfully");
		
		CallableStatement cstmt = conn.prepareCall(query);
		
		 cstmt.setString(1, "vinayak karale");
         cstmt.setString(2, "via@example.com");
   
        ResultSet rs =  cstmt.executeQuery(); 
		
        while (rs.next()) {		    	  
	    	// if(rs.getInt("id") == 4)  // bad programming
			    System.out.println(rs.getString("name")+" - "+rs.getString("email"));
		  }
		
		
		} catch (Exception e) {
			
		  e.printStackTrace();
		}
	}
}
