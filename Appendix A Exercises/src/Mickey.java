//Appendix A

//Exercise 2
//		Modify Mickey.java to draw ears on the ears, and ears on those ears,
//		and more ears all the way down until the smallest ears are only 3 pixels wide
//			See comments in method "mickey" for changes (line 30 & 40)

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
import java.awt.Rectangle;
import javax.swing.JFrame;


public class Mickey extends Canvas {

    public void boxOval(Graphics g, Rectangle bb) {
	g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
    boxOval(g, bb);
    //This stops Mickey from repeating itself once the width of the ears get to less than 3 pixels
    if (bb.width <3) {
    	return;
    }
 

	int dx = bb.width/2;
	int dy = bb.height/2;
	Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

	//Switch this to call Mickey again, not boxOval, so it becomes smaller by half again
	half.translate(-dx/2, -dx/2);
	mickey(g, half);

	half.translate(dx*2, 0);
	mickey(g, half);
	
	
    }

    public void paint(Graphics g) {
	Rectangle bb = new Rectangle(100, 150, 200, 200);
	g.setColor(Color.gray);
	mickey(g, bb);
	mickey(g, bb);
    }

    public static void main(String[] args) {
	// make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// add the canvas
	Canvas canvas = new Mickey();
        canvas.setSize(400, 400);
	canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

	// show the frame
	frame.pack();
        frame.setVisible(true);
    }
}
