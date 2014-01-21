import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Squiral extends JApplet {
	private final int SEGMENT_LENGTH = 10;

	public void init() {
		setSize(800, 800);
		setBackground(Color.WHITE);
	}

	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 2000, 2000);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3));

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		g2d.setColor(Color.BLUE);
		
		int lastX = xCenter;
		int lastY = yCenter;
		// Start drawing squiral
		int iIncrement = 5;
		
		for (int i = 0; i < 800 ; i = i + 10) {
			iIncrement = iIncrement + 5;
			
			g.drawLine (lastX, lastY, lastX, lastY + iIncrement);
			lastY = lastY + iIncrement;
			
			g.drawLine (lastX, lastY, lastX + iIncrement, lastY);
			lastX = lastX + iIncrement;
			
			iIncrement = iIncrement + 5;
			
			g.drawLine (lastX, lastY, lastX, lastY - iIncrement);
			lastY = lastY - iIncrement;
			
			g.drawLine (lastX, lastY, lastX - iIncrement, lastY);
			lastX = lastX - iIncrement;
		}
	}
}