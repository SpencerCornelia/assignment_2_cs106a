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
		private int userInput;
		
		while (userInput != sentinal) {
			System.out.print("Please enter a value: ");
			userInput = input.nextInt();
		}
		input.close();
	}
}

