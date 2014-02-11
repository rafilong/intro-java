//Documentation of the methods are in the method

import java.awt.Color;


public class Square {	
	//square variables
	int tetrimoId; //the id of the tetrimo
	int type; //type of square (decides the color)
	boolean leftN = false; //whether or not it has a left neighbor
	boolean rightN = false; //whether or not it has a right neighbor
	boolean topN = false; //whether or not it has a top neighbor
	boolean bottomN = false; //whether or not it has a bottom neighbor
	boolean active = false; //whether or not the tetrimo is active
	boolean hasSquare = false; //whether or not the square actually has a "square" in it

	public Square() {
		//variables will be declared using settet()
	}

	public static void createSquares() {
		//creates squares
		for (int x = 0; x < Main.gameWidth; x++) {
			for (int y = 0; y < Main.gameHeight; y++) {
				Grid.grid[x][y] = new Square();
			}
		}
	}

	public static void setSquare(int x, int y, int type, int id) {
		//sets the values of the squares, only for testing purposes
		Grid.grid[x][y].hasSquare = true;
		Grid.grid[x][y].active = true;
		Grid.grid[x][y].tetrimoId = 0;
		Grid.grid[x][y].type = type;
		Grid.grid[x][y].tetrimoId = id;
	}

	public static void neighborFindCall() {
		//calls to find whether there are neighbors in all of the squares - neighbors are counted by having the same tetrimoId and being active
		for (int x = 0; x < Main.gameWidth; x++) {
			for (int y = 0; y < Main.gameHeight -1; y++) {
				if (Grid.grid[x][y].hasSquare) {
					//calls the Square.neighborFind() method, which searches for neighbors
					Grid.grid[x][y].leftN = neighborFind(x, y, "left");
					Grid.grid[x][y].rightN = neighborFind(x, y, "right");
					Grid.grid[x][y].topN = neighborFind(x, y, "top");
					Grid.grid[x][y].bottomN = neighborFind(x, y, "bottom");
				}
			}
		}
	}

	public static boolean neighborFind(int x, int y, String side) {
		//searches for neighbors depending on which side is included in the argument
		//for what is counted as a neighbor, see Square.neighborFindCall()
		boolean retval = false;

		if (side.equals("left")) {
			if (x != 0 && sameTetrimoId(Grid.grid[x][y], Grid.grid[x-1][y]) && Grid.grid[x-1][y].hasSquare) retval = true;
		} if (side.equals("right")) {
			if (x+1 != Main.gameWidth && sameTetrimoId(Grid.grid[x][y], Grid.grid[x+1][y]) && Grid.grid[x+1][y].hasSquare) retval = true;
		} if (side.equals("top")) {
			if (y+1 <= Main.gameHeight -3 && sameTetrimoId(Grid.grid[x][y], Grid.grid[x][y+1]) && Grid.grid[x][y+1].hasSquare) retval = true;
		} if (side.equals("bottom")) {
			if (y != 0 && sameTetrimoId(Grid.grid[x][y], Grid.grid[x][y-1]) && Grid.grid[x][y-1].hasSquare) retval = true;
		}

		//retval is changed to true when there are neighbors
		return retval;
	}

	public static boolean sameTetrimoId(Square s1, Square s2) {
		//checks to see whether the tetrimoId of 2 squares are the same
		return s1.tetrimoId == s2.tetrimoId && s1.type == s2.type;
	}
}
