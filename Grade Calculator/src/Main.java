
public class Main {

	public static void main(String args[]) {
		startup();
	}
	
	static void startup() {
		Output.printinterperet("Grade Impact Calculator");
		Output.newline();
		Output.printinterperet("Determine the worst grade you need to get to keep your goal");
		Output.newline();
		
		typeofcalculate();
	}
	
	static void typeofcalculate() {
		boolean answered = false;
		
		Output.printinterperet("Is your test going to be part of the test grade or percentage of grade?");
		Output.newline();
				
		while(!answered) {
			if (Input.inputstring().equals("test")) {
				partoftestgrade();
				answered = true;
			} else if (Input.inputstring().equals("percentage")) {
				percentageofgrade();
				answered = true;
			} else {
				Output.printinterperet("Please answer 'test grade' or 'percentage of grade'");
				Output.newline();
			}
		}	
	}	
	
	static void partoftestgrade() {
		
	}
	
	static void percentageofgrade() {
		
	}
}
