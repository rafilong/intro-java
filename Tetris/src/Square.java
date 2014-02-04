//Documentation of the methods are in the method

import java.awt.Color;


public class Square {
	boolean hasSquare = false;
	
	//square variables
	int tetrimoId; //the id of the tetrimo
	int type; //type of square (decides the color)
	int xLoca; //x coordinate (is it necessary?)
	int yLoca; //y coordinate (is it necessary?)
	boolean leftN = false; //whether or not it has a left neighbor
	boolean rightN = false; //whether or not it has a right neighbor
	boolean topN = false; //whether or not it has a top neighbor
	boolean bottomN = false; //whether or not it has a bottom neighbor
	boolean active = false; //whether or not the tetrimo is active
	
	public Square() {
		//variables will be declared using settet()
	}
	
	public static void neighborFindCall() {
		for (int x = 0; x < Main.gameWidth; x++) {
			for (int y = 0; y < Main.gameHeight; y++) {
				if (Grid.grid[x][y].hasSquare) {
					Grid.grid[x][y].leftN = neighborFind(x, y, "left");
					Grid.grid[x][y].rightN = neighborFind(x, y, "right");
					Grid.grid[x][y].topN = neighborFind(x, y, "top");
					Grid.grid[x][y].bottomN = neighborFind(x, y, "bottom");
				}
			}
		}
	}
	
	public static boolean neighborFind(int x, int y, String side) {
		boolean retval = false;
		
		if (side.equals("left")) {
			if (sameTetrimoId(Grid.grid[x][y], Grid.grid[x-1][y]) && Grid.grid[x-1][y].hasSquare) retval = true;
		} if (side.equals("right")) {
			if (sameTetrimoId(Grid.grid[x][y], Grid.grid[x+1][y]) && Grid.grid[x+1][y].hasSquare) retval = true;
		} if (side.equals("top")) {
			if (sameTetrimoId(Grid.grid[x][y], Grid.grid[x][y+1]) && Grid.grid[x][y+1].hasSquare) retval = true;
		} if (side.equals("bottom")) {
			if (sameTetrimoId(Grid.grid[x][y], Grid.grid[x][y-1]) && Grid.grid[x][y-1].hasSquare) retval = true;
		}
		
		return retval;
	}
	
	public static boolean sameTetrimoId(Square s1, Square s2) {
		return true;
	}
}