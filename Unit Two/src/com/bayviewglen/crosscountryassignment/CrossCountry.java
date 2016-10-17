package com.bayviewglen.crosscountryassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
	
		Scanner user = new Scanner(System.in);
	
		// you need to make it to seconds no negative
		
		final int secondsPerMinute = 60;
		
		
		System.out.println(" Enter your first name and last name ");
		String name = user.nextLine();
				
		
		
		
		System.out.println(" Please enter your time for the first kilometre ");
		String timeOne = user.nextLine();
		
		int minutes1 = Integer.parseInt(timeOne.split(":")[0]);
		double seconds1 = Double.parseDouble(timeOne.split(":")[1]);
		
		double totalSecondsSplit1 = minutes1 * 60 + seconds1;
		
		
		
		// took the code from deslauries
		
		System.out.println(" Please enter your time for the second kilometer ");
		String timeTwo = user.nextLine();
		
		int minutes2 = Integer.parseInt(timeTwo.split(":")[0]);
		double seconds2 = Double.parseDouble(timeTwo.split(":")[1]);
		
		double totalSecondsSplit2 = minutes2 * 60 + seconds2;
				
		double split2TotalSeconds = totalSecondsSplit2 - totalSecondsSplit1;
		
		int split2minutes = (int)(split2TotalSeconds/60);
		
		double split2seconds =  split2TotalSeconds%60;
		
		
				
//*************** putting the star thing so i can see the stuff easier
		
		System.out.println(" Please enter your time to finish ");
		String timeThree = user.nextLine();
		
		int minutes3 = Integer.parseInt(timeThree.split(":")[0]);
		double seconds3 = Double.parseDouble(timeThree.split(":")[1]);
		
		double totalSecondsSplit3 = minutes3 * 60 + seconds3;
				
		double split3TotalSeconds = totalSecondsSplit3 - totalSecondsSplit2;
		
		int split3minutes = (int)(split3TotalSeconds/60);
		
		double split3seconds =  split3TotalSeconds%60;
		
		
	
//********************************************************		
		
		double total_runner1seconds = totalSecondsSplit1 + totalSecondsSplit2 + totalSecondsSplit3;

		int totalminutes1 = (int)(total_runner1seconds/60);
		
		double totalseconds1 =  total_runner1seconds%60;
	
		
		System.out.println("\n \nRunner One Summary \n");
		
		System.out.println("Runner:" + name);
		
		System.out.printf("Split One: %2d:%2.3f \n", minutes1, seconds1);
		System.out.printf("Split Two: %2d:%2.3f \n", split2minutes, split2seconds);
		System.out.printf("Split Three: %2d:%2.3f \n", split3minutes, split3seconds);
		System.out.printf("Total: %2d:%2.3f \n", totalminutes1, totalseconds1);
		
		//System.out.println("Split 1: " + formattedSecondsSplit1);
		//System.out.printf("Split 2: %2d:%2.3f \n", split2minutes, split2seconds); 
		//System.out.printf("Split 3: %2d:%2.3f \n", split3minutes, split3seconds);
		//System.out.printf("Total: %2d:%2.3f \n", total1minutes, total1seconds);
		
		// you have to use printf to limit the digits in the time
		// the /n makes it so there are spaces between the lines

		
		System.out.println("\n");
		
				
		//*************************************
		
		//RUNNER TWO
		
		
		
		
		System.out.println("Enter your first name and lastname R2 ");
		String namer2 = user.nextLine();
		
		System.out.println(" Please enter your first kilometer ");
		
		String timeOner2 = user.nextLine();;
	

		int minutes1R2 = Integer.parseInt(timeOner2.split(":")[0]);
		double seconds1R2 = Double.parseDouble(timeOner2.split(":")[1]);
		
		double totalSecondsSplit1R2 = minutes1R2 * 60 + seconds1R2;
		
		
		// took the code from deslauries
		
		
		//*************************************
		
		
		
		System.out.println(" Please enter your time for the second kilometer ");
		String timeTwor2 = user.nextLine();
		
		int minutes2R2 = Integer.parseInt(timeTwor2.split(":")[0]);
		double seconds2R2 = Double.parseDouble(timeTwor2.split(":")[1]);
	
		
		double totalSecondsSplit2R2 = minutes2R2 * 60 + seconds2R2;
				
		double split2TotalSecondsR2 = totalSecondsSplit2R2 - totalSecondsSplit1R2;
		
		int split2minutesR2 = (int)(split2TotalSecondsR2/60);
		
		double split2secondsR2 =  split2TotalSecondsR2%60;

		
		//*************************************
		
		
		// this is for runner two know I am assigning split split2minutesr2
		
		System.out.println(" Please enter your time to finish ");
		String timeThreer2 = user.nextLine();
		
		
		int minutes3R2 = Integer.parseInt(timeThreer2.split(":")[0]);
		double seconds3R2 = Double.parseDouble(timeThreer2.split(":")[1]);
		
		double totalSecondsSplit3R2 = minutes3R2 * 60 + seconds3R2;
				
		double split3TotalSecondsR2 = totalSecondsSplit3R2 - totalSecondsSplit2R2;
		
		int split3minutesR2 = (int)(split3TotalSecondsR2/60);
		
		double split3secondsR2 =  split3TotalSecondsR2%60;
		
		//*************************************
		
		double total_runner2seconds = totalSecondsSplit1R2 + totalSecondsSplit2R2 + totalSecondsSplit3R2;

		int totalminutesR2 = (int)(total_runner2seconds/60);
		
		double totalsecondsR2 =  total_runner2seconds%60;
	
		//*************************************
		
		System.out.println("\n \nRunner Two Summary \n");
		
		System.out.println("Runner:" + namer2);
		
		System.out.printf("Split One: %2d:%2.3f \n", minutes1R2, seconds1R2);
		System.out.printf("Split Two: %2d:%2.3f \n", split2minutesR2, split2secondsR2);
		System.out.printf("Split Three: %2d:%2.3f \n", split3minutesR2, split3secondsR2);
		System.out.printf("Total: %2d:%2.3f \n", totalminutesR2, totalsecondsR2);
		
		System.out.println("\n");
		
		// i put the n's to add spaces to make it look nicer 
		
		
				
		
		
		
		
		
		
		
		// runner 3 is coming up next
		
		System.out.println(" Enter your first name and last name R3 ");
		String namer3 = user.nextLine();
		

		System.out.println(" Please enter your time for the first kilometer ");
		String timeOner3 = user.nextLine();
	
				
	
		int minutes1R3 = Integer.parseInt(timeOner3.split(":")[0]);
		double seconds1R3 = Double.parseDouble(timeOner3.split(":")[1]);
		
		double totalSecondsSplit1R3 = minutes1R3 * 60 + seconds1R3;
		
	
		
		// OMG
		
		System.out.println(" Please enter your time for the second kilometer ");
		String timeTwor3 = user.nextLine();
		
		int minutes2R3 = Integer.parseInt(timeTwor3.split(":")[0]);
		double seconds2R3 = Double.parseDouble(timeTwor3.split(":")[1]);
		
		double totalSecondsSplit2R3 = minutes2R3 * 60 + seconds2R3;
				
		double split2TotalSecondsR3 = totalSecondsSplit2R3 - totalSecondsSplit1R3;
		
		int split2minutesR3 = (int)(split2TotalSecondsR3/60);
		
		double split2secondsR3 =  split2TotalSecondsR3%60;
		
		
		//********************************************
		System.out.println(" Please enter your time to finish ");
		String timeThreer3 = user.nextLine();
		
		int minutes3R3 = Integer.parseInt(timeThreer3.split(":")[0]);
		double seconds3R3 = Double.parseDouble(timeThreer3.split(":")[1]);
		
		double totalSecondsSplit3R3 = minutes3R3 * 60 + seconds3R3;
				
		double split3TotalSecondsR3 = totalSecondsSplit3R3 - totalSecondsSplit2R3;
		
		int split3minutesR3 = (int)(split3TotalSecondsR3/60);
		
		double split3secondsR3 =  split3TotalSecondsR3%60;	
		//***********************
		double total_runner3seconds = totalSecondsSplit1R3 + totalSecondsSplit2R3 + totalSecondsSplit3R3;

		int totalminutesR3 = (int)(total_runner3seconds/60);
		
		double totalsecondsR3 =  total_runner3seconds%60;
		
		//***********************************
       System.out.println("\n Runner Three Summary \n");
		
		System.out.println("Runner:" + namer3);
		System.out.printf("Split One: %2d:%2.3f \n", minutes1R3, seconds1R3);
		System.out.printf("Split Two: %2d:%2.3f \n", split2minutesR3, split2secondsR3);
		System.out.printf("Split Three: %2d:%2.3f \n", split3minutesR3, split3secondsR3);
		System.out.printf("Total: %2d:%2.3f \n", totalminutesR3, totalsecondsR3);
		
		
		// ^^^^ printing out the table
		
		System.out.println("\n");		
		
		
		
		
		// runner 4 stands for R4
		
		System.out.println(" Enter your first name and last name R4 ");
		String namer4 = user.nextLine();
		

		System.out.println(" Please enter your time for the first kilometer ");
		String timeOner4 = user.nextLine();
		
				
		int minutes1R4 = Integer.parseInt(timeOner4.split(":")[0]);
		double seconds1R4 = Double.parseDouble(timeOner4.split(":")[1]);
		
		double totalSecondsSplit1R4 = minutes1R4 * 60 + seconds1R4;
	
		//********************
		System.out.println(" Please enter your time for the second kilometer ");
		String timeTwor4 = user.nextLine();
		
		int minutes2R4 = Integer.parseInt(timeTwor4.split(":")[0]);
		double seconds2R4 = Double.parseDouble(timeTwor4.split(":")[1]);
		
		double totalSecondsSplit2R4 = minutes2R4 * 60 + seconds2R4;
				
		double split2TotalSecondsR4 = totalSecondsSplit2R4 - totalSecondsSplit1R4;
		
		int split2minutesR4 = (int)(split2TotalSecondsR4/60);
		
		double split2secondsR4 =  split2TotalSecondsR4%60;
		
		
		//****************************
		System.out.println(" Please enter your time to finish ");
		String timeThreer4 = user.nextLine();
		
		int minutes3R4 = Integer.parseInt(timeThreer4.split(":")[0]);
		double seconds3R4 = Double.parseDouble(timeThreer4.split(":")[1]);
		
		double totalSecondsSplit3R4 = minutes3R4 * 60 + seconds3R4;
				
		double split3TotalSecondsR4 = totalSecondsSplit3R4 - totalSecondsSplit2R4;
		
		int split3minutesR4 = (int)(split3TotalSecondsR4/60);
		
		double split3secondsR4 =  split3TotalSecondsR4%60;	
		//***********************
		double total_runner4seconds = totalSecondsSplit1R4 + totalSecondsSplit2R4 + totalSecondsSplit3R4;

		int totalminutesR4 = (int)(total_runner4seconds/60);
		
		double totalsecondsR4 =  total_runner4seconds%60;
		
		//*******************************************
		System.out.println("\n \nRunner Four Summary \n");
		
		System.out.println("Runner:" + namer4);
		System.out.printf("Split One: %2d:%2.3f \n", minutes1R4, seconds1R4);
		System.out.printf("Split Two: %2d:%2.3f \n", split2minutesR4, split2secondsR4);
		System.out.printf("Split Three: %2d:%2.3f \n", split3minutesR4, split3secondsR4);
		System.out.printf("Total: %2d:%2.3f \n", totalminutesR4, totalsecondsR4);
		
		System.out.println("\n");
		
		
		
		
		
		//**************** RUNNA FIVE TIME :(
		
		// runner 5 is down
		
		System.out.println(" Enter your first name and last name R5 ");
		String namer5 = user.nextLine();
		
		System.out.println(" Please enter your time for the first kilometer ");
		String timeOner5 = user.nextLine();
		
		int minutes1R5 = Integer.parseInt(timeOner5.split(":")[0]);
		double seconds1R5 = Double.parseDouble(timeOner5.split(":")[1]);
		
		double totalSecondsSplit1R5 = minutes1R5 * 60 + seconds1R5;

	
		//***********************
		System.out.println(" Please enter your time for the second kilometer ");
		String timeTwor5 = user.nextLine();
		
		int minutes2R5 = Integer.parseInt(timeTwor5.split(":")[0]);
		double seconds2R5 = Double.parseDouble(timeTwor5.split(":")[1]);
		
		double totalSecondsSplit2R5 = minutes2R5 * 60 + seconds2R5;
				
		double split2TotalSecondsR5 = totalSecondsSplit2R5 - totalSecondsSplit1R5;
		
		int split2minutesR5 = (int)(split2TotalSecondsR5/60);
		
		double split2secondsR5 =  split2TotalSecondsR5%60;
		
		

		
		//**********************
	    System.out.println(" Please enter your time to finish ");
		String timeThreer5 = user.nextLine();
		
		
		int minutes3R5 = Integer.parseInt(timeThreer5.split(":")[0]);
		double seconds3R5 = Double.parseDouble(timeThree.split(":")[1]);
		
		double totalSecondsSplit3R5 = minutes3R5 * 60 + seconds3R5;
				
		double split3TotalSecondsR5 = totalSecondsSplit3R5 - totalSecondsSplit2R5;
		
		int split3minutesR5 = (int)(split3TotalSecondsR5/60);
		
		double split3secondsR5 =  split3TotalSecondsR5%60;
		
		
	
//********************************************************		
		
		double total_runner5seconds = totalSecondsSplit1R5 + totalSecondsSplit2R5 + totalSecondsSplit3R5;

		int totalminutesR5 = (int)(total_runner5seconds/60);
		
		double totalsecondsR5 =  total_runner5seconds%60;
	
		
	
		//***************************
		System.out.println("\n \nRunner Five Summary \n");
		
		System.out.println("Runner:" + namer5);
		System.out.printf("Split One: %2d:%2.3f \n", minutes1R5, seconds1R5);
		System.out.printf("Split Two: %2d:%2.3f \n", split2minutesR5, split2secondsR5);
		System.out.printf("Split Three: %2d:%2.3f \n", split3minutesR5, split3secondsR5);
		System.out.printf("Total: %2d:%2.3f \n", totalminutesR5, totalsecondsR5);
		
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("\nRunner's Name          |  Split One Time  |  Split Two Time  |  Split Three Time  |  Total Time");
		System.out.printf(name + "                %2d:%2.3f        " + "%2d:%2.3f       "+ "%2d:%2.3f           "+ "%2d:%2.3f         \n ",minutes1, seconds1, split2minutes, split2seconds, split3minutes, split3seconds, totalminutes1, totalseconds1);
		System.out.printf(namer2 + "              %2d:%2.3f        " + "%2d:%2.3f       "+ "%2d:%2.3f           "+ "%2d:%2.3f        \n ",minutes1R2, seconds1R2, split2minutesR2, split2secondsR2, split3minutesR2, split3secondsR2, totalminutesR2, totalsecondsR2);
		System.out.printf(namer3 + "              %2d:%2.3f        " + "%2d:%2.3f       "+ "%2d:%2.3f           "+ "%2d:%2.3f        \n ",minutes1R3, seconds1R3, split2minutesR3, split2secondsR3, split3minutesR3, split3secondsR3, totalminutesR3, totalsecondsR3);
		System.out.printf(namer4 + "              %2d:%2.3f        " + "%2d:%2.3f       "+ "%2d:%2.3f           "+ "%2d:%2.3f        \n ",minutes1R4, seconds1R4, split2minutesR4, split2secondsR4, split3minutesR4, split3secondsR4, totalminutesR4, totalsecondsR4);
		System.out.printf(namer4 + "             %2d:%2.3f        " + "%2d:%2.3f       "+ "%2d:%2.3f           "+ "%2d:%2.3f        \n ",minutes1R5, seconds1R5, split2minutesR5, split2secondsR5, split3minutesR5, split3secondsR5, totalminutesR5, totalsecondsR5);
		
		// NEEDED TO PUT %2D.... FARTHER BACK SO IT COULD LINE UP WITH THE NAMES BETTER 
		// :(
		
		}
	

}
