package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewglenPools {

	public static void main(String[] args) {
		
	Scanner COC = new Scanner(System.in);
		
	
	double length, width, depth, deepend, transhallowtodeep, amount; 
	
	System.out.println("Please enter the length ");
	length = COC.nextDouble();
	
	System.out.println(length);
	
	System.out.println("Please enter the width ");
	width = COC.nextDouble();
	
	System.out.println(width);
	
	System.out.println("Please enter the depth");
	depth = COC.nextDouble();
	
	System.out.println(depth);
	
	// get rest of info

	amount = calculateAmount(length, width, depth);
	
	System.out.println(amount);
	
	}
	
	public static double calculateAmount(double length, double width, double depth) {
	
	double amount;
	
	amount = length*width*depth*0.9;
	
	return amount;
	
	}

}
