import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class Display extends JComponent implements MouseListener {
    public int DISPLAY_WIDTH;
    public int DISPLAY_HEIGHT;
	
	public static boolean on = false;
		
    public Display(int width, int height) {
        DISPLAY_WIDTH = width;
        DISPLAY_HEIGHT = height;
        setSize(width, height);  
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
    	int x = e.getX();
    	int y = e.getY();
    	
    	if (on==true && x>75 && y>70 && x<140 && y<130 ) {
    		on = false;
    		while (true) {
    			lelel();
    		}
    	} else if (on==false && x>45 && y>70 && x<155 && y<130 ){
    		on = true;
    		while (true) {
    		lelel();
    		}
    	} else {
    		System.out.println("Not on button");
    	}
    	System.out.println(on);
    }

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void lelel() {
		System.out.println("I say hi");
		if (on == true) {
			Keypress.start();
		} else {
			
		}
	}
}
