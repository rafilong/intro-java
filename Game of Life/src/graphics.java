import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class graphics extends Canvas {

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new graphics();
        canvas.setSize(400, 400);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
    	
    	int grid[][];
    	for (int r = 0; r < 40; r ++) {
    		for (int c = 0; c < 58; c ++) {
    			if (grid[r][c] == live) {
    				drawLive(r, c, g);
    			}
    		}
    	}
    }
}