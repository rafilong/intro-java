//Appendix A

//Exercise 1
//		Draw a flag of Japan, a red circle on a white background that is wider than it is tall
//			See code

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class flagOfJapan extends Canvas {

	 public static void main(String[] args) {
		 //makes the frame
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 //adds the canvas
		 Canvas canvas = new flagOfJapan();
		 canvas.setSize(600, 400);
		 frame.getContentPane().add(canvas);
		 
		 //shows the frame
		 frame.pack();
		 frame.setVisible(true);
		
	 }

	 public void paint(Graphics g) {
		 //Colors the background white - makes a rectangle same size as canvas that is white
		 g.setColor(Color.WHITE);
		 g.fillRect(0, 0, 600, 400);
		 //Makes the red circle for the flag
		 g.setColor(Color.RED);
		 g.fillOval(200, 100, 200, 200);
	 }
}
