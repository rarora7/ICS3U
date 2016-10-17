package com.bayviewglen.dayfive;

public class RandomStuff {

	public static void main(String[] args) {
		int num = 292837;
		int digit1 = num / 100000;
		System.out.println(digit1);
		
		int digit2 = num / 10000 % 10;
		System.out.println(digit2);
		int digit3 = num / 1000 % 10;
		System.out.println(digit3);
		int digit4 = num / 100 % 10;
		System.out.println(digit4);
		int digit5 = num / 10 % 10;
		System.out.println(digit5);
		int digit6 = num % 10;
		System.out.println(digit6);
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
		System.out.println(sum);

	}

}
