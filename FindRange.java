/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;
import java.util.Scanner;

public class FindRange extends ConsoleProgram {
	public void run() {
		int sentinal = 0;
		Scanner input = new Scanner(System.in);
		println("This program finds the largest and smallest numbers.");
		int userInput = 1;
		//initialize an array
		
		while (userInput != sentinal) {
			System.out.print("Please enter a value: ");
			userInput = input.nextInt();
			//push userInput into the array
		}
		smallestNumber();
		largestNumber();
		input.close();
	}
	
	private int smallestNumber() {
		//sort the array
		//if array.length = 1 return the value
		//if array.length = 0 return an error notifying user they need to input an integer
	}
	
	private int largestNumber() {
		//sort the array
		//if array.length = 1 return nothing
		//if array.length = 0 return nothing
		//return array[array.length - 1]
	}
}

