/*
 * See TestMyPolynomial for reading
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) { // varargs input (variable number of inputs)
		this.coeffs = coeffs; // varargs type input are treated as an array
	}
	
	public MyPolynomial(String filename) {
		Scanner in = null; //sets the scanner value to equal nothing
		try { //try catch for when the file is not in place
			in = new Scanner(new File(filename)); // opens file
		} catch (FileNotFoundException e) { //catches when the file isn't found
			System.err.println("Could not find file, error found below: ");
			e.printStackTrace();
		}
		int degree = in.nextInt(); // reads the degree
		coeffs = new double[degree + 1]; // allocates the array
		for (int i = 0; i < coeffs.length; ++i) {
			setCoeffs(i, in.nextDouble()); //sets the coeffs using setCoeffs
		}
	}
	
	public double[] getCoeffs() {
		return this.coeffs; //returns the list of coeffs
	}
	
	public double getCoeffs(int place) {
		return this.coeffs[place]; //returns the coeffs in a certain place
	}

	public void setCoeffs(double[] coeffs) {
		this.coeffs = coeffs; //sets the coeffs with an array
	}
	
	public void setCoeffs(int place, double value) {
		this.coeffs[place] = value; //sets the coeffs in a certain place
	}

	public int getDegree() {
		return this.getCoeffs().length - 1; //gets the degree of the polynomial by finding the length
	}
	
	public String toString() {
		if (coeffs.length > 1) { //prints the primary coefficients (so they won't have the ^1 and ^0)
			String retval = coeffs[1] + "x + " + coeffs[0];
			for (int i = 2; i < this.getDegree() + 1; i++) { //a for loop that loops for all of the coefficients
				retval = this.getCoeffs(i) + "x^" + (i) + " + " + retval; 
			}
			return retval; //returns the retval
		} else {
			return coeffs[0] + ""; //if the polynomial is of size one, it prints the coefficient of the 0th power
		}
	}
	
	public double evaluate(double x) {
		double retval = 0; //sets retval to equal zero
		for (int i = 0; i <= this.getDegree(); i++) { //
			retval += this.getCoeffs(i) * Math.pow(x, i);
		}
		return retval;
	}
	
	public MyPolynomial add(MyPolynomial another) {
		double[] out;
		if (this.getDegree() > another.getDegree()) {
			out = new double[this.getDegree() + 1];
			for (int i = 0; i <= this.getDegree(); i++) {
				if (i > another.getDegree()) {
					out[i] = this.getCoeffs(i); 
				} else {
					out[i] = this.getCoeffs(i) + another.getCoeffs(i); 
				}
			}
		} else {
			out = new double[another.getDegree() + 1];
			for (int i = 0; i <= this.getDegree(); i++) {
				if (i > this.getDegree()) {
					out[i] = another.getCoeffs(i); 
				} else {
					out[i] = another.getCoeffs(i) + this.getCoeffs(i); 
				}			}
		}
		return new MyPolynomial(out);
	}
	
	public MyPolynomial multiply(MyPolynomial another) {
		double[] out = new double[this.getDegree() + another.getDegree() + 1];
		for (int i = 0; i <= this.getDegree(); i++) {
			for (int r = 0; r <= another.getDegree(); r++) {
				double coeffsM = this.getCoeffs(i) * another.getCoeffs(r);
				out[i+r] += coeffsM;
			}
		}
		return new MyPolynomial(out);
	}
}
