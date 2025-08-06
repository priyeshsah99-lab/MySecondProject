package com.corejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ArraylistDemo {
	
	 public static void main(String[] args)
	  
	 {
		 ArrayList<Object> al1 = new ArrayList<>(); al1.add(10);
		 
		 al1.add("software"); al1.add(40); al1.add(90); al1.add(50);
			
		  ArrayList<Object> al2 = new ArrayList<>(); al2.add(90); al2.add("software");
		  al2.add(120); al2.add("ysm");
		  
		   al1.addAll(al2);
		 
		  System.out.println(al1);
	 }
	   
	  
 }
	 
	  
	
		  
		  
		  
			  
			 
		
	 
	 
