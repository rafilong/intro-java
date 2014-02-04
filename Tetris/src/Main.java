//Documentation of the methods are in the method

import javax.swing.JFrame;

public class Main {
	//game and image dimensions
	public static int imgWidth = 204;
	public static int imgHeight = 406;
	public static int gameWidth = 10;
	public static int gameHeight = 24;
		
	//makes the game fullscreen (these variables will be the size of the screen)
	public static int currentWinX = 0;
	public static int currentWinY = 0;

	//game variables
	public static boolean gameOn = false;
	static int currentId = 0;
	
	public static Display display = new Display();

	
	public static void main(String[] args) {
		gameOn = true;
				
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(imgWidth + 16, imgHeight + 38);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		
		frame.add(display);
		
		//fills the grid with squares
		createSquares();
		
		//initializes the grid
		display.init();
		
		setSquare(2, 20, 3, 0);
		
//		Time.threadTimeStart();
	
		testCase();
	}
	
	public static void createSquares() {
		for (int x = 0; x < gameWidth; x++) {
			for (int y = 0; y < gameHeight; y++) {
				Grid.grid[x][y] = new Square();
			}
		}
	}
	
	public static void setSquare(int x, int y, int type, int id) {
		Grid.grid[x][y].hasSquare = true;
		Grid.grid[x][y].active = true;
		Grid.grid[x][y].tetrimoId = 0;
		Grid.grid[x][y].type = type;
		Grid.grid[x][y].tetrimoId = id;
	}
	
	private static void testCase() {
		int success = 0;
		int methodSuccess = 0;
		
		//test cases for method 1 - Display.findY()
		System.out.println("Method 1 Test Cases");
		System.out.println("calls Display.findY(), which takes a y value in the grid of Squares, and translates it into the y value taken by the Java draw methods, taking into account square width and the offset created by the image");
		newLine();
		
		System.out.println("Method 1 Test 1: (1) -> (374)");
		System.out.println("Return: " + Display.findY(1));
		if (Display.findY(1) == 374) {
			success++;
			methodSuccess++;
			System.out.println("Method 1 Test 1 succeeded");
		} else {
			System.out.println("Method 1 Test 1 failed");
		}
		newLine();
		
		System.out.println("Method 1 Test 2: (5) -> (310)");
		System.out.println("Test 2 Return: " + Display.findY(5));
		if (Display.findY(5) == 310) {
			success++;
			methodSuccess++;
			System.out.println("Method 1 Test 2 succeeded");
		} else {
			System.out.println("Method 1 Test 2 failed");
		}
		newLine();
		
		System.out.println("Method 1 Test 3: (42) -> (-282)");
		System.out.println("Test 3 Return: " + Display.findY(42));
		if (Display.findY(42) == -282) {
			success++;
			methodSuccess++;
			System.out.println("Method 1 Test 3 succeeded");
		} else {
			System.out.println("Method 1 Test 3 failed");
		}
		newLine();
		
		System.out.println(methodSuccess + " successes, " + (3-methodSuccess) + " failures in method 1");
		methodSuccess = 0;
		
		newLine();
		newLine();
		
		
		//test cases for method 2 - Square.neighborfind()
		System.out.println("Method 2 Test Cases");
		System.out.println("calls Square.neighborfind(), which takes an x value, y value, and a side as arguments. It then searches the side indicated for whether it has a square, and whether the square shares the same tetrimoid. It returns a boolean for true if the tetrimo id is the same for the neighbor and the neighbor has a square");
		newLine();
		
		System.out.println("Method 2 Test 1: Squares in [1][1] and [1][2] with the same id; (1, 1, 'top') -> true");
		setSquare(1, 1, 1, 1);
		setSquare(1, 2, 1, 1);
		System.out.println("Return: " + Square.neighborFind(1, 1, "top"));
		if (Square.neighborFind(1, 1, "top")) {
			success++;
			methodSuccess++;
			System.out.println("Method 2 Test 1 succeeded");
		} else {
			System.out.println("Method 2 Test 1 failed");
		}
		newLine();
		
		System.out.println("Method 2 Test 2: Squares in [4][1] and [5][1] with the same id; (4, 1, 'right') -> true");
		setSquare(4, 1, 2, 4);
		setSquare(5, 1, 2, 4);
		System.out.println("Test 2 Return: " + Square.neighborFind(4, 1, "right"));
		if (Square.neighborFind(4, 1, "right")) {
			success++;
			methodSuccess++;
			System.out.println("Method 2 Test 2 succeeded");
		} else {
			System.out.println("Method 2 Test 2 failed");
		}
		newLine();
		
		System.out.println("Method 2 Test 3: Squares in [5][5] and [4][5] with the same id; (5, 5, 'left') -> true");
		setSquare(5, 5, 3, 42);
		setSquare(4, 5, 3, 42);
		System.out.println("Test 3 Return: " + Square.neighborFind(5, 5, "left"));
		if (Square.neighborFind(5, 5, "left")) {
			success++;
			methodSuccess++;
			System.out.println("Method 2 Test 3 succeeded");
		} else {
			System.out.println("Method 2 Test 3 failed");
		}
		newLine();
		
		System.out.println(methodSuccess + " successes, " + (3-methodSuccess) + " failures in method 1");
		
		newLine();
		newLine();
		
		
		
	}
	
	private static void newLine() {
		System.out.println();
	}
}