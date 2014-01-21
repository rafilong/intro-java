public class LiveOrDead {

	public static void main(String args[]) {
		double ranNum = Math.random();
		
		if (ranNum > 0.7) {
			System.out.println("Alive: " + ranNum);
			//alive
		} else {
			System.out.println("Dead: " + ranNum);
			//dead
		}
	}
}