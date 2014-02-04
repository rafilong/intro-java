//Physics class: makes blocks fall, clears lines, and checks whether there is "fusion"

//Documentation of the methods are in the method
public class Physics {
	
	public static void dropCall() {
		for (int x = 0; x < Main.gameWidth; x++) {
			for (int y = 0; y < Main.gameHeight; y++) {
				drop(x, y);
			}
		}
	}
	
	public static void drop(int x, int y) {
		if (Grid.grid[x][y].hasSquare && Grid.grid[x][y].active) {
			if (y-1 >= 0) {
				Square square = Grid.grid[x][y];
				Square belowSquare = Grid.grid[x][y -1];
				
				belowSquare.hasSquare = true;
				belowSquare.active = true;
				belowSquare.tetrimoId = Grid.grid[x][y].tetrimoId;
				belowSquare.type = Grid.grid[x][y].type;
				
				square.hasSquare = false;
				square.active = false;
				square.tetrimoId = 0;
				square.type = 0;
			}
		}
	}
}
