
public class Tetrimo {
	public static void spawnTet(int type) {
		if (type == 0) spawnI();
		if (type == 1) spawnJ();
		if (type == 2) spawnL();
		if (type == 3) spawnO();
		if (type == 4) spawnS();
		if (type == 5) spawnT();
		if (type == 6) spawnZ();
		else {
			System.out.println("Not valid tetrimo type");
		}
	}
	
	public static void spawnTet(String type) {
		if (type.equals("I")) spawnI();
		if (type.equals("J")) spawnJ();
		if (type.equals("L")) spawnL();
		if (type.equals("O")) spawnO();
		if (type.equals("S")) spawnS();
		if (type.equals("T")) spawnT();
		if (type.equals("Z")) spawnZ();
		else {
			System.out.println("Not valid tetrimo type");
		}
	}
	
	private static void spawnI() {
		
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
