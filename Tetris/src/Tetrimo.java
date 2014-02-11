import java.awt.Color;


public class Tetrimo {
	private static int currentId = 0;
	
	public static Square[] activeSquares = new Square[4];
	public static Square activeCenter;
	
	public static void spawnTet(int type) {
		if (type == 0) spawnI();
		if (type == 1) spawnJ();
		if (type == 2) spawnL();
		if (type == 3) spawnO();
		if (type == 4) spawnS();
		if (type == 5) spawnT();
		if (type == 6) spawnZ();
		if (type > 6) {
			System.out.println("Not valid tetrimo type");
		}
		
		currentId++;
	}
	
	public static void spawnTet(String type) {
		if (type.equals("I")) {
			spawnI();
		} else if (type.equals("J")) {
			spawnJ();
		} else if (type.equals("L")) {
			spawnL();
		} else if (type.equals("O")) {
			spawnO();
		} else if (type.equals("S")) {
			spawnS();
		} else if (type.equals("T")) {
			spawnT();
		} else if (type.equals("Z")) {
			spawnZ();
		} else {
			System.out.println("Not valid tetrimo type");
		}
		
		currentId++;
	}
	
	private static void spawnI() {
		Square.setSquare((Main.gameWidth/2)-2, Main.gameHeight-2, 0, currentId);
		Square.setSquare((Main.gameWidth/2)-1, Main.gameHeight-2, 0, currentId);
		Square.setSquare((Main.gameWidth/2), Main.gameHeight-2, 0, currentId);
		Square.setSquare((Main.gameWidth/2)+1, Main.gameHeight-2, 0, currentId);

	}
	
	private static void spawnJ() {
		
	}
	
	private static void spawnL() {
		
	}
	
	private static void spawnO() {
		
	}
	
	private static void spawnS() {
		
	}
	
	private static void spawnT() {
		
	}
	
	private static void spawnZ() {
		
	}
}
