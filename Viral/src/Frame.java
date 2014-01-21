import javax.swing.JFrame;

/* Frame.java
 * 
 * Makes Frame & adds display
 * 
 */

public class Frame {

	static int windowWidth;
	static int windowHeight;
	
	public static void main(String[] args) {
		windowWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		windowHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		
		JFrame frame = new JFrame();
		frame.setSize(windowWidth, windowHeight);
		Display display = new Display(windowWidth, windowHeight);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(display);
		frame.setVisible(true);
	}
	
}