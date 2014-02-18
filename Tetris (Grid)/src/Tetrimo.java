import java.awt.Color;
import java.util.Stack;


public class Tetrimo {
	private static int currentId = 0;
	
	public static Stack tetrimos = new Stack();
	public static Square activeCenter;
	
	
	
	private int type;
	private Square[] Squares = new Square[4];

	
	public Tetrimo(int type) {
		this.type = type;
		spawnTet(type, this);
	}
	
	public static void spawnTet(int type, Tetrimo tet) {
		if (type == 0) spawnI(tet);
		if (type == 1) spawnJ(tet);
		if (type == 2) spawnL(tet);
		if (type == 3) spawnO(tet);
		if (type == 4) spawnS(tet);
		if (type == 5) spawnT(tet);
		if (type == 6) spawnZ(tet);
		if (type > 6) {
			System.out.println("Not valid tetrimo type");
		}
		
		currentId++;
	}
	
	public static void spawnTet(String type, Tetrimo tet) {
		if (type.equals("I")) {
			spawnI(tet);
		} else if (type.equals("J")) {
			spawnJ(tet);
		} else if (type.equals("L")) {
			spawnL(tet);
		} else if (type.equals("O")) {
			spawnO(tet);
		} else if (type.equals("S")) {
			spawnS(tet);
		} else if (type.equals("T")) {
			spawnT(tet);
		} else if (type.equals("Z")) {
			spawnZ(tet);
		} else {
			System.out.println("Not valid tetrimo type");
		}
		
		currentId++;
	}
	
	private static void spawnI(Tetrimo tet) {
		Square.setSquare((Main.gameWidth/2)-2, Main.gameHeight-2, 0, currentId);
		tet.Squares[0] = Grid.grid[(Main.gameWidth/2)-2][Main.gameHeight-2];
		Square.setSquare((Main.gameWidth/2)-1, Main.gameHeight-2, 0, currentId);
		Square.setSquare((Main.gameWidth/2), Main.gameHeight-2, 0, currentId);
		Square.setSquare((Main.gameWidth/2)+1, Main.gameHeight-2, 0, currentId);
	}
	
	private static void spawnJ(Tetrimo tet) {
		
	}
	
	private static void spawnL(Tetrimo tet) {
		
	}
	
	private static void spawnO(Tetrimo tet) {
		
	}
	
	private static void spawnS(Tetrimo tet) {
		
	}
	
	private static void spawnT(Tetrimo tet) {
		
	}
	
	private static void spawnZ(Tetrimo tet) {
		
	}
}
