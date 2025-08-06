package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {
	
		// TODO Auto-generated constructor stub
	// TODO Auto-generated method stub
	
/*	public static void main(String[] args) throws ClassNotFoundException {
		
	String inserQuary = "insert into projects (project_name, start_date, end_date, status)"
			+ "values('Inventory System', '2025-05-20', '2025-07-20', 'Completed')";
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
		 
		 System.out.println("Connected to the database succesfully");
		 
		 Statement stmt = conn.createStatement();
		 
		  int count = stmt.executeUpdate(inserQuary);
		  
		
		  System.out.println("count :"+count);	 
		  
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
   }

}*/
	
	public static void main(String[]args) {
		
		String quary = "select project_name, start_date, end_date, status from projects";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Mysql@123");
		    System.out.println("");
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery(quary);
		    
		    
		   while (rs.next()) {
			   
			   System.out.println(rs.getString("project_name")+" "+rs.getString("start_date")+" "+rs.getString("end_date")+" "+rs.getString("status"));
		   }
			   
		} catch (Exception e) {
			   
			   e.printStackTrace();
		   }
		
		}
}
	
	
