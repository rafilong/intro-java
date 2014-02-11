//Method documentation is in the method - check out the code on line 11, 13, and 18 for the TreeSet

//keeps track of level and time left in game
//keeps track of current game stats

import java.util.TreeSet;

public class Levels {
	public static int level = 12;
	//this TreeSet stores all the scores, and will sort them on which ones the highest + duplicate scores will be deleted
	public static TreeSet<Integer> highScores = new TreeSet<Integer>();
	
	//when the game ends, the score is added to the high score with this method
	public static void newScore(int score) {
		//checks to see whether or not there is a new high score
		newHighScore(score);
		
		//adds the score to the treeset
		highScores.add(score);
	}
	
	//when the score entered is higher than the oldest high score, it prints a message
	public static void newHighScore(int score) {
		if (score > highScores.first()) {
			System.out.println("New high score - " + score);
		}
	}
	
	//this method is a test, will print scores
	public static void printScores() {
		for(int i : highScores) {
			System.out.println(i);
		}
	}
}
