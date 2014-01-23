import java.awt.Color;


public class Square {
	boolean hastet = false;
	
	//square variables
	int tetrimoid; //the id of the tetrimo
	int type; //type of square (decides the color)
	int xloca; 
	int yloca;
	boolean leftn = false;
	boolean rightn = false;
	boolean topn = false;
	boolean bottomn = false;
		
	public Square() {
		//variables will be declared using settet()
	}
	
	public static void neighborfind() {
		for (int x = 0; x < Main.gamewidth; x++) {
			for (int y = 0; y < Main.gameheight; y++) {
				Grid.grid[x][y].leftn = sametetrimoid(Grid.grid[x][y], Grid.grid[x-1][y]);
				Grid.grid[x][y].rightn = sametetrimoid(Grid.grid[x][y], Grid.grid[x+1][y]);
				Grid.grid[x][y].topn = sametetrimoid(Grid.grid[x][y], Grid.grid[x][y+1]);
				Grid.grid[x][y].bottomn = sametetrimoid(Grid.grid[x][y], Grid.grid[x][y-1]);
			}
		}
	}
	
	public static boolean sametetrimoid(Square s1, Square s2) {
		return s1.tetrimoid == s2.tetrimoid;
	}
}