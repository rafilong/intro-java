//Appendix A

//Exercise 3

//Step 1
//		Download Moire.java

//Step 2
//		Read the paint method and draw a sketch of what you expect it to do.  Did it do what you expected?
//			I expect it to draw circles increasingly large in size until they are the width of the screen.  I did not expect it to make a tunnel!

//Step 3
//		How do you increase or decrease the space between the circles?
//			See line 34

//Step 4
//		Modify the program so the circles are centered and concentric
//			I added variable d, which moves the circles.  See line 36 & 42

//Step 5
//		Go to MoireRadials.java

//Step 6
//		Play around with graphical patterns
//			See MoirePattern.java
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


public class Moire extends Canvas {

    public void paint(Graphics g) {
	int i = 40;
	int d = 180;
	while (i < getWidth()) {
	    g.drawOval (d, d, i, i);
	    //Step 3
	    //	Increase or decrease the value here (line 41) to change the distance between the circles
	    i = i + 6;
	    d = d - 3;
	}
    }

    public static void main(String[] args) {
	// make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// add the canvas
	Canvas canvas = new Moire();
        canvas.setSize(400, 400);
	canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

	// show the frame
	frame.pack();
        frame.setVisible(true);
    }
}
