import javax.swing.JFrame;

public class Main {
	public static int framewidth = 216;
	public static int frameheight = 188;
	public static boolean on = false;
	public static int currentwinx = 0;
	public static int currentwiny = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(216, 188);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		
		Display display = new Display();
		frame.add(display);
		
	}
}