package com.corejava;

public class StaticVariableDemo {

	public StaticVariableDemo(int empid, String name ) {
		// TODO Auto-generated constructor stub
	
		this.empid = empid;
		this.name = name;
		
	}
	
	int empid;
	String name;
	
	static String  company= "YSM solution";
	
	void display() {
		
		System.out.println(empid+" "+ name +" "+company);
		  
	  }
	public static void main(String[]args) {
		
		StaticVariableDemo s1 = new StaticVariableDemo(10, "priyesh");
		s1.display();
	}
}
  