import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.io.IOException;
import javax.imageio.ImageIO;

class Surface extends JPanel {
    
    public void getARGB(int pixel) {
        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
    }

    private Image image; // Creates new variable of the Image type
    private BufferedImage bufimg;
    private Dimension d;

    public Surface() {
        // Constructor of the Surface object
        loadImage();
        determineAndSetSize();
        createGrayImage();
    }
    
    private void determineAndSetSize() { // Sets the size of the window according to the image size

        d = new Dimension();
        d.width = image.getWidth(null);
        d.height = image.getHeight(null);
        setPreferredSize(d);
    }

   private void createGrayImage() { // Converts image into grayscale (removes color)
        
        bufimg = new BufferedImage(d.width, d.height, 
                BufferedImage.TYPE_BYTE_GRAY);

        Graphics2D g2d = bufimg.createGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();        
    }
    
    private void loadImage() {
        // Loads the image with the ImageIcon class
        image = new ImageIcon("z.jpg").getImage();
    }

    private void doDrawing(Graphics g) {
        // Draws image to the window
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bufimg, 0, 0, null);
    }

    @Override
    public void paintComponent(Graphics g) {
        // Performs the method that draws the image to the window
        super.paintComponent(g);
        doDrawing(g);
    }
}

public class image extends JFrame {
    // The window Frame
static int w = 10; //fill in height and width
static int h = 10;
public static int[][] grid = new int[w][h];

	public static void average(int r, int c) {
        int total = 0;
        total += grid[r + 1][c];
        total += grid[r - 1][c];
        total += grid[r][c + 1];
        total += grid [r][c -1];

    }
	
    public image() {
        // Constructor
        initUI();
    }

    private void initUI() {
        
        setTitle("Devil Z");

        add(new Surface()); // Adds all of the stuff on the JPanel we called Surface and also modified

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { // Runs all of this
                image ex = new image();
                ex.setVisible(true);
            }
        });
        // Put code stuff to run right here
    }
}

