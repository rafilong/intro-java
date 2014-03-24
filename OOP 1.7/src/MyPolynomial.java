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
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			System.err.println("Could not find file, error found below: ");
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	public double[] getCoeffs() {
		return this.coeffs;
	}
	
	public double getCoeffs(int place) {
		return this.coeffs[place];
	}

	public void setCoeffs(double[] coeffs) {
		this.coeffs = coeffs;
	}
	
	public void setCoeffs(int place, double value) {
		this.coeffs[place] = value;
	}

	public int getDegree() {
		return this.getCoeffs().length - 1;
	}
	
	public String toString() {
		if (coeffs.length > 1) {
			String retval = coeffs[1] + "x + " + coeffs[0];
			for (int i = 2; i < this.getDegree() + 1; i++) {
				retval = this.getCoeffs(i) + "x^" + (i) + " + " + retval; 
			}
			return retval;
		} else {
			return coeffs[0] + "";
		}
	}
	
	public double evaluate(double x) {
		double retval = 0;
		for (int i = 0; i < this.getDegree(); i++) {
			retval += this.getCoeffs(i) * Math.pow(x, i); 
		}
		return retval;
	}
	
	public MyPolynomial add(MyPolynomial another) {
		double[] out;
		if (this.getDegree() > another.getDegree()) {
			out = new double[this.getDegree() + 1];
			for (int i = 0; i <= another.getDegree(); i++) {
				out[i] = this.getCoeffs(i) + another.getCoeffs(i); 
			}
		} else {
			out = new double[another.getDegree() + 1];
			for (int i = 0; i <= this.getDegree(); i++) {
				out[i] = this.getCoeffs(i) + another.getCoeffs(i); 
			}
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
