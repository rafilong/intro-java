import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
   	 // Bring up a JFrame with squares to represent the cells
   	 final int DISPLAY_WIDTH = Display.COLS * 6 + 200;
   	 final int DISPLAY_HEIGHT = Display.ROWS * 6 + 160;
   	 JFrame f = new JFrame();
   	 f.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
   	 Display display = new Display(DISPLAY_WIDTH, DISPLAY_HEIGHT);
   	 f.setLayout(null);
   	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 f.setTitle("Conway's Game of Life");
   	 f.add(display);
   	 f.setVisible(true);
    }
}

