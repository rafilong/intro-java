//Appendix A

//Exercise 3 step 6
//Step 6
//		Create your own Moire pattern
//			See code below and run program for pattern

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class CircleMoire extends Canvas {

    public void paint(Graphics g) {
	int x = 0;
	int y = 200;
	while (x <= 200) {
	    g.drawLine (0, y, x, 0);
	    x = x + 10;
	    y = y - 10;
	}
	int x1 = 200;
	int y1 = 400;
	while (x <= 400) {
		g.drawLine (x, 0, 400, y);
		x1 = x1 + 10;
		y1 = y1 - 10;
	}
    }
    
    
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Canvas canvas = new CircleMoire();
        canvas.setSize(400, 400);
	canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

	frame.pack();
        frame.setVisible(true);
    }
}