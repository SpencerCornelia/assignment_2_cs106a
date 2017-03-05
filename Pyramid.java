/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {
	
	/*
	 * need to begin the row x pixels over
	 * need to run a loop and create a new GRect counter amount of times
	 * can use brick_width to determine when to create the next GRect
	 * 
	 */

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	private double baseCounter = BRICKS_IN_BASE;
	double sizeOfBrickBase = baseCounter * BRICK_WIDTH;
	private double x = (width - baseCounter) / 2;
	
	
	public void run() {
		while (baseCounter > 0) {
			createRow();
			height -= BRICK_HEIGHT;
			baseCounter -= 1;
		}
	}
	
	public void createRow() {
		int tempX = (int)x;
		//run a loop where each GRect begins brick_width in pixels away
		//loop ends at sizeOfBrickBase
		for (int i = 1; i <= baseCounter; i++) {
			GRect grect = new GRect(tempX, height - 100, BRICK_WIDTH, BRICK_HEIGHT);
			tempX += BRICK_WIDTH;
			add(grect);
		}
	}
}

