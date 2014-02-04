//Documentation of the methods are in the method

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;


public class Display extends JComponent {
	BufferedImage background;
	
	//Color variables
	//colors picked from http://www.w3schools.com/tags/ref_colorpicker.asp
	//colors are named [tetrimo type] + ["" or "D"]
	//dark colors are 3 levels darker
	public static Color I = new Color(0x00cfcf);
	public static Color ID = new Color(0x009191);
	public static Color J = new Color(0x297acc);
	public static Color JD = new Color(0x1D558F);
	public static Color L = new Color(0xff8000);
	public static Color LD = new Color(0xb25a00);
	public static Color O = new Color(0xfbf579);
	public static Color OD = new Color(0xb0ac55);
	public static Color S = new Color(0x80db70);
	public static Color SD = new Color(0x4e994e);
	public static Color T = new Color(0xad44d6);
	public static Color TD = new Color(0x792496);
	public static Color Z = new Color(0xf94e4e);
	public static Color ZD = new Color(0xae3737);
	
	//array is I, J, L, O, S, T, Z
	public static Color[][] colors = {{I, J, L, O, S, T, Z}, {ID, JD, LD, OD, SD, TD, ZD}};

	//Dimension variables
	//offsets for image (distances from edge to start of game)
	public static int xOffset = 22;
	public static int yOffset = 16;
	//dimensions of the square pieces
	public static int squareDim = 16;
	
	public Display() {
		//loads the background image to the variable 'background'
		try {
			background = ImageIO.read(new File("Board.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void init() {
		//sets the size of JComponent
		setSize(Main.imgWidth, Main.imgHeight);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		//draws the image
		g.drawImage(background, 0, 0, null);
		//paints the tetrimos
		paintGame(g);
	}
	
	private static void paintGame(Graphics g) {
		//runs through the grid and draws them if there is a square there
		for (int w = 0; w < Main.gameWidth; w++) {
			for (int h = 0; h < Main.gameHeight - 2; h++) {
				if (Grid.grid[w][h].hasSquare) paintTetrimo(g, w, h);
			}
		}
	}
	
	private static void paintTetrimo(Graphics g, int x, int y) {
		//sets the color to the dark type color
		g.setColor(colors[0][Grid.grid[x][y].type]);
		//draws from the top-left to the bottom-right
		g.fillRect(xOffset + x*16, findY(y) - 16, 16, 16);
		
		drawEdges(g, x, y);
	}
	
	private static void drawEdges(Graphics g, int x, int y) {
		//sets the color to the light type color
		g.setColor(colors[1][Grid.grid[x][y].type]);
		//draws the left line if there is no neighbor
		if (!Grid.grid[x][y].leftN) drawline(g, x, y, "left");
		//draws the right line if there is no neighbor
		if (!Grid.grid[x][y].rightN) drawline(g, x, y, "right");
		//draws the top line if there is no neighbor
		if (!Grid.grid[x][y].topN) drawline(g, x, y, "top");
		//draws the bottom line if there is no neighbor
		if (!Grid.grid[x][y].bottomN) drawline(g, x, y, "bottom");
	}
		
	public static int findY(int y) {
		//finds the y value of the coordinate
		//the reason this is necessary is that java draws the Y going down, but I have my grid-Y goes up - this translates it
		return (Main.imgHeight - yOffset - y*squareDim);
	}
	
	private static void drawline(Graphics g, int x, int y, String side) {
		//draws the edges according to which side is included in the arguments
		if (side.equals("left")) g.drawLine(xOffset + x*squareDim, findY(y+1), xOffset + x*squareDim, findY(y) -1);
		if (side.equals("right")) g.drawLine(xOffset + (x+1)*squareDim -1, findY(y) -1, xOffset + (x+1)*squareDim -1, findY(y+1));
		if (side.equals("top")) g.drawLine(xOffset + (x+1)*16 -1, findY(y+1), xOffset + x*16, findY(y+1));
		if (side.equals("bottom")) g.drawLine(xOffset + x*16, findY(y) - 1, xOffset + (x+1)*16 -1, findY(y) -1);
	}
}