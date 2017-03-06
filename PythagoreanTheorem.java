/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;
import java.util.Scanner;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		System.out.println("Enter values to compute the pythagorean theorem: ");
		System.out.print("a: ");
		double userInputA = a.nextDouble();
		System.out.print("b: ");
		double userInputB = b.nextDouble();
		System.out.println("a: " + userInputA);
		System.out.println("b: " + userInputB);
		double c = Math.sqrt((userInputA * userInputA) + (userInputB * userInputB));
		System.out.println("c = " + c);
		a.close();
		b.close();
	}
}
