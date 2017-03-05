/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		GOval outsideOval = new GOval(100, 100, 144, 144);
		outsideOval.setColor(Color.red);
		outsideOval.setFilled(true);
		add(outsideOval);
		
		GOval middleOval = new GOval(125, 125, 93.6, 93.6);
		middleOval.setColor(Color.white);
		middleOval.setFilled(true);
		add(middleOval);
		
		GOval innerOval = new GOval(140, 140, 43.2, 43.2);
		innerOval.setColor(Color.red);
		innerOval.setFilled(true);
		add(innerOval);
	}
}
