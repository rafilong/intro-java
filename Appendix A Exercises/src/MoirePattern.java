//Appendix A

//Exercise 3 step 6
//Step 6
//		Create your own Moire pattern
//			See code below and run program for pattern

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class MoirePattern extends Canvas {

    public void paint(Graphics g) {
	int x = 0;
	while (x <= 400) {
	    g.drawLine (400, 0, x, 400);
	    x = x + 10;
	}
	int y = 0;
	while (y <= 400) {
	    g.drawLine (400, 0, 0, y);
	    y = y + 10;
	}
	
	int x1 = 0;
	while (x1 <= 400) {
	    g.drawLine (0, 400, x1, 0);
	    x1 = x1 + 10;
	}
	int y1 = 0;
	while (y1 <= 400) {
	    g.drawLine (0, 400, 400, y1);
	    y1 = y1 + 10;
	}
    }
    
    
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Canvas canvas = new MoirePattern();
        canvas.setSize(400, 400);
	canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

	frame.pack();
        frame.setVisible(true);
    }
}