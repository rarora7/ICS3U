package com.bayviewglen.dayfive;

import java.util.Scanner;

public class DayFiveHomeworkTwo {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print(" Enter a numer ");
		int maxScore = keyboard.nextInt();
		
		System.out.print(" " + maxScore + ": ");
		int studentScore = keyboard. nextInt();
		
		double percent= ((double) studentScore / maxScore) * 100;
		
		System.out. println("The student received " + studentScore + " / " + maxScore +" which equates to a " + percent + "%");
		
		keyboard.close();

	}

}