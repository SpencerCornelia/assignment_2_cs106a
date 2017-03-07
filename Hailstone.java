/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;
import java.util.Scanner;

public class Hailstone extends ConsoleProgram {
	int counter;
	int value;
	public void run() {
		Scanner a = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userInput = a.nextInt();
		counter = userInput;
		runHailstone();
	}
	
	public void runHailstone() {
		while (counter != 0) {
			if (counter % 2 != 0) {
				value = (counter * 3) + 1;
				println(counter + " is odd so I make 3n + 1: " + value);
				counter = value;
			} else {
				value = (counter / 2);
				println(counter + " is even so I take half: " + value);
				counter = value;
			}
		}
	}
}

