//Appendix A

//Exercise 3 step 5

//Step 5
//		Create a method called radial that draw a radial set of line segments as shown in figure in Appendix A (right), but they should be close enough together to create a Moire pattern
//			See comments below
/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class MoireRadials extends Canvas {

    public void paint(Graphics g) {
    //Creates a new variable named x that has value 0
	int x = 0;
    //Repeats until x is greater than the width of the screen
	while (x <= 400) {
		//Draws a line with 1 point in the center, and the other at the top of the screen (y = 0) and x 
	    g.drawLine (200, 200, x, 0);
	    //Increases the value of x so the line gradually moves across the screen
	    x = x + 10;
	}
	//See lines 24-31
	int y = 0;
	while (y <= 400) {
	    g.drawLine (200, 200, 0, y);
	    y = y + 10;
	}
	//Does the same thing as the above (lines 24-31), except this time the second point is on the opposite edge (y = 400)
	int x1 = 0;
	while (x1 <= 400) {
	    g.drawLine (200, 200, x1, 400);
	    x1 = x1 + 10;
	}
	//See lines 39-43
	int y1 = 0;
	while (y1 <= 400) {
	    g.drawLine (200, 200, 400, y1);
	    y1 = y1 + 10;
	}
    }
    

    public static void main(String[] args) {
	// make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// add the canvas
	Canvas canvas = new MoireRadials();
        canvas.setSize(400, 400);
	canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

	// show the frame
	frame.pack();
        frame.setVisible(true);
    }
}
