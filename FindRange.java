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
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value: ");
		int sentinal = input.nextInt();
		println("This program finds the largest and smallest numbers.");
		System.out.print(sentinal);
	}
}

