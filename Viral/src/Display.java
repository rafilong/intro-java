import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

/* Display.java
 * 
 * Makes JFrame
 * Turns saved arrangements of boxes into boxes
 * Turns boxes into rects
 * Displays these rects
 */
public class Display extends JComponent implements KeyListener, MouseListener {
    public int DISPLAY_WIDTH;
    public int DISPLAY_HEIGHT;
    
    private int calcTime;
	public int pauseTime;
	
	public static int xPos, yPos, width, height;
	public static Color color;
	
    public Display(int width, int height) {
        DISPLAY_WIDTH = width;
        DISPLAY_HEIGHT = height;
        setSize(width, height);
        character(4, 4, 1);
        addKeyListener(this);
        addMouseListener(this);
        
    }
    
	public static void character(int x, int y, int movementType) {
		if (movementType == 1) {
			drawRect(x, y, 3, 3, Color.BLACK);
		}
	}
	
	public static void drawRect(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(xPos, yPos, width, height);
		repaint();
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_W);
		if (arg0.getKeyCode() == KeyEvent.VK_A);
		if (arg0.getKeyCode() == KeyEvent.VK_S);
		if (arg0.getKeyCode() == KeyEvent.VK_D);
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
