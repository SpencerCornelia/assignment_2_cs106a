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
	System.out.print("Please enter a value: ");
	Scanner input = new Scanner(System.in);
	int static final SENTINAL = input.nextInt();
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
	}
}

