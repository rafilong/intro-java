/*
 * OOP Exercise 1.8
 * Test code written by Rafi Long, some from OOP Exercise 1.8
 * Documentation is in the code
 */

/*
 * constructor
 * tested on line: 26, 27
 * no expected return
 * 
 * add
 * tested on line: 30
 * expected return: 11111111111133333333333333333333333333333333333333333333333333
 * 
 * multiply
 * tested on line: 31
 * expected return: 246913580246913580246913580246913580246913580246911111111111108641975308641975308641975308641975308641975308642
 */

import java.math.BigInteger;

public class TestBigInteger {
	
   public static void main(String[] args) {
      BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111"); //makes a new big integer with value 11111111111111111111111111111111111111111111111111111111111111
      BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222"); //makes a new big integer with value 22222222222222222222222222222222222222222222222222
      
      System.out.println("Testing add and multiply");
      System.out.println("Added is: " + i1.add(i2)); //i1 is added to i2
      System.out.println("Multiplied is: " + i1.multiply(i2)); //i1 is multiplied by i2
   }
}