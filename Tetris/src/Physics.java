//makes blocks fall, clears lines, and checks whether there is "fusion"
public class Physics {
	
	public static void drop() {
		for (int x = 0; x < Main.gamewidth; x++) {
			for (int y = 0; y < Main.gameheight; y++) {
				if (Grid.grid[x][y].hastet && Grid.grid[x][y].active) {
					Grid.grid[x][y].hastet = false;
					Grid.grid[x][y].active = false;
					
					Grid.grid[x][y -1].hastet = true;
					Grid.grid[x][y -1].active = true;
				}
			}
		}
	}
}
