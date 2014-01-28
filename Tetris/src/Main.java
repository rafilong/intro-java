import javax.swing.JFrame;

public class Main {
	//game and image dimensions
	public static int imgwidth = 204;
	public static int imgheight = 406;
	public static int gamewidth = 10;
	public static int gameheight = 22;
		
	//makes the game fullscreen (these variables will be the size of the screen)
	public static int currentwinx = 0;
	public static int currentwiny = 0;

	//game variables
	public static boolean gameon = false;
	static int currenttid = 0;
	
	public static Display display = new Display();

	
	public static void main(String[] args) {
		gameon = true;
				
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(imgwidth + 16, imgheight + 38);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		
		frame.add(display);
		
		//fills the grid with squares
		createtets();
		
		//initializes the grid
		display.init();
		
		settet(2, 10, 0);
		
		Time.threadtimestart();
	
	}
	
	public static void createtets() {
		for (int x = 0; x < gamewidth; x++) {
			for (int y = 0; y < gameheight; y++) {
				Grid.grid[x][y] = new Square();
			}
		}
	}
	
	public static void settet(int x, int y, int type) {
		Grid.grid[x][y].hastet = true;
		Grid.grid[x][y].active = true;
		Grid.grid[x][y].tetrimoid = 0;
		Grid.grid[x][y].type = type;
	}
}