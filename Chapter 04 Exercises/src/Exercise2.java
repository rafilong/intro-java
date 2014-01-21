//Chapter 4
//Exercise 2

//Step 1: Write the number 1 next to the first statement of this program that will be executed.

//Step 2: Write the number 2 next to the second statement, and so on until the end of the program. 

//Step 3: What is the value of the parameter blimp when baffle gets invoked?
	//"rattle" is the value of blimp when baffle gets invoked

//Step 4: What is the output of this program?
	//ik
	//rattle
	//pingzoop
	//boo-wa-ha-ha

public class Exercise2 {

	public static void baffle(String blimp) {
		System.out.println(blimp); //5
		zippo("ping", -5); //6
	}
	
	public static void zippo(String quince, int flag) {
		if (flag < 0) { //2, 7
			System.out.println(quince + "zoop"); //8
		} else {
			System.out.println("ik"); //3
			baffle(quince); //4
			System.out.println("boo-wa-ha-ha"); //9
		}
	}
	
	public static void main(String[] args) {
		zippo("rattle", 13); //1
	}
}