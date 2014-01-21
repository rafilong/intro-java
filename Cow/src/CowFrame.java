import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	//Template color
	private final Color DARKBROWN = new Color(0x321b04);
	private final Color MEDIUMBROWN = new Color(0x3d2610);
	private final Color LIGHTBROWN = new Color(0x472e15);
	//For the multiple brown colors
	private final Color DARKGRAY = new Color(0xa1a1a1);
	private final Color MEDIUMGRAY = new Color(0xb2b2b2);
	private final Color LIGHTGRAY = new Color(0x6c6c6c);
	private final Color VERYLIGHTGRAY = new Color(0xbababa);
	//For the multiple gray colors on patches
	private final Color DARKNOSEGRAY = new Color(0x525252);
	private final Color LIGHTNOSEGRAY = new Color(0x707070);
	private final Color VERYLIGHTNOSEGRAY = new Color(0xdbdbdb);
	private final Color KINDALIGHTNOSEGRAY = new Color(0xc1c0c0);
	//For the nose gray colors
	private final Color DARKPINK = new Color(0xa96a6a);
	private final Color MEDIUMPINK = new Color(0xe29e9e);
	private final Color LIGHTPINIK = new Color(0xfabfbf);
	//For the multiple pink colors
	private final Color GOODBLACK = new Color(0x000000);
	private final Color GOODWHITE = new Color(0xFFFFFF);
	//For "good" white and black
	
	
	public CowFrame () {
		init();
	}
	
	public void init() {
		setSize(1500,1000);
		setBackground(Color.WHITE);
		repaint();
	}

	public void paint(Graphics g) {
		//For pixels, multiply by 7
		//Coordinates are temporary
		//
		//
		//RIGHT FACING COW
		//
		//Cow body
		//Cow body is 18 * 10
		g.setColor(MEDIUMBROWN);
		g.fillRect(50, 72, 126, 70);
		//Body texturing
		g.setColor(MEDIUMGRAY);
		g.fillRect(50, 72, 7, 7);
		g.setColor(DARKBROWN);
		g.fillRect(57, 72, 14, 7);
		//
		//
		//Cow left leg
		//Cow leg 4 * 12
		//
		g.setColor(MEDIUMBROWN);
		g.fillRect(50, 142, 28, 84);
		//
		//
		//Cow right leg
		//
		g.setColor(MEDIUMBROWN);
		g.fillRect(148, 142, 28, 84);
		//
		//
		//Cow head
		//Cow head is 8 * 8
		//
		g.setColor(MEDIUMBROWN);
		g.fillRect(176, 45, 56, 56);
		//Eyebrows
		g.setColor(VERYLIGHTGRAY);
		g.fillRect(176, 59, 14, 7);
		g.fillRect(218, 59, 14, 7);
		//Eyes
		g.setColor(GOODWHITE);
		g.fillRect(176, 66, 14, 7);
		g.fillRect(218, 66, 14, 7);
		g.setColor(GOODBLACK);
		g.fillRect(176, 66, 7, 7);
		g.fillRect(225, 66, 7, 7);
		//Nose + surrounding area
		g.setColor(LIGHTNOSEGRAY);
		g.fillRect(190, 87, 28, 14);
		g.setColor(DARKNOSEGRAY);
		g.fillRect(197, 94, 14, 7);
		g.setColor(GOODBLACK);
		g.fillRect(190, 87, 7, 7);
		g.fillRect(211, 87, 7, 7);
		g.setColor(VERYLIGHTNOSEGRAY);
		g.fillRect(183, 87, 7, 14);
		g.fillRect(218, 87, 7, 14);
		g.fillRect(190, 80, 28, 7);
		g.setColor(KINDALIGHTNOSEGRAY);
		g.fillRect(183, 94, 7, 7);
		//Head texturing
		g.setColor(DARKBROWN);
		g.fillRect(176, 45, 7, 7);
		g.fillRect(190, 45, 7, 7);
		g.setColor(VERYLIGHTGRAY);
		g.fillRect(197, 45, 14, 7);
		g.setColor(DARKGRAY);
		g.fillRect(211, 45, 14, 7);
		g.setColor(DARKBROWN);
		g.fillRect(225, 45, 7, 7);
		g.setColor(VERYLIGHTGRAY);
		g.fillRect(197, 52, 21, 7);
		g.setColor(DARKBROWN);
		g.fillRect(218, 52, 7, 7);
		g.setColor(VERYLIGHTGRAY);
		g.fillRect(197, 59, 14, 7);
		g.setColor(MEDIUMGRAY);
		g.fillRect(197, 66, 7, 7);
		g.setColor(DARKBROWN);
		g.fillRect(183, 80, 7, 7);
		g.fillRect(218, 80, 7, 7);
		g.fillRect(225, 87, 7, 7);
	}
}