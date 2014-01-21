import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* Frame.java
 * 
 * Makes Frame & adds display
 * 
 */

public class Frame {

	static int windowWidth;
	static int windowHeight;
	
	public static void main(String[] args) throws IOException {
		windowWidth = 216;
		windowHeight = 188;
		
		String path = "off.png";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        
        String path1 = "on.png";
        File file1 = new File (path);
        BufferedImage image1 = ImageIO.read(file1);
        JLabel label1 = new JLabel(new ImageIcon(image1));
        
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
        
        //
        f.getContentPane().add(label);
		//
        
		f.setSize(windowWidth, windowHeight);

		Display display = new Display(windowWidth, windowHeight);
		f.add(display);
		
	}
}