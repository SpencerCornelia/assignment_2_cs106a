/*
 * File: DrawCenteredRect.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the DrawCenteredRect problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawCenteredRect extends GraphicsProgram {
	
	/** Size of the centered rect */
	private static final int WIDTH = 350;
	private static final int HEIGHT = 270;
	private int x = 50%;
	private int y = 0;

	public void run() {
		GRect grect = new GRect(x, y, WIDTH, HEIGHT);
		grect.setFillColor(Color.blue);
		grect.setFilled(true);
		add(grect);
	}
}

