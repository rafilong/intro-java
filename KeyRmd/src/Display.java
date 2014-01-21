import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Display extends JPanel{

	private BufferedImage onimage;
    private BufferedImage offimage;

    public Display() {
    	//adding image on
    	try {                
    		onimage = ImageIO.read(new File("on.png"));
    	} catch (IOException ex) {
    		// handle exception...
    	}
    	
    	//adding image off
    	try {                
    		offimage = ImageIO.read(new File("off.png"));
    	} catch (IOException ex) {
    		// handle exception...
    	}
    	
    	repaint();
    }
    
	public void paint(Graphics g) {
        if (Main.on) {
        	g.drawImage(onimage, 0, 0, null);
        } else {
            g.drawImage(offimage, 0, 0, null); // see javadoc for more info on the parameters            
        }
        repaint();
    }

}