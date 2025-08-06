package com.corejava;

public class VarArg {

	public VarArg() {
		// TODO Auto-generated constructor stub
	}
	 
	public static void main(String[]args) {
		
		sum();
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		
	}
	
	public static void sum(int...x) {
		
		int total = 0;
		for (int x1 : x) {
			
		total += x1; 
		
		}
		System.out.println("total : " + total);
	}

}
