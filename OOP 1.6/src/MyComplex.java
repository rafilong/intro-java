/*
 * See MyComplexTest for reading
 */

public class MyComplex {
	private double real;
	private double imag;
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "(" + this.real + " + " + this.imag + ")";
	}
	
	public boolean isReal() {
		return (imag == 0);
	}
	
	public boolean isImaginary() {
		return (imag != 0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.getReal() == real && this.getImag() == imag);
	}
	
	public boolean equals(MyComplex another) {
		return this.equals(another.getReal(), another.getImag());
	}
	
	public double magnitude() {
		return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImag(), 2));
	}
	
	public double argumentInRadians() {
		return Math.atan2(this.getImag(), this.getReal());
	}
	
	public int argumentInDegrees() {
		return (int)(this.argumentInRadians()*180/Math.PI);
	}
	
	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}
	
	public MyComplex add(MyComplex another) {
		return new MyComplex(this.real + another.real, this.imag + another.imag);
	}
	
	public MyComplex subtract(MyComplex another) {
		return new MyComplex(this.real - another.real, this.imag - another.imag);
	}
	
	public MyComplex multiplyWith(MyComplex another) {
		this.setReal(this.real * another.real - this.imag * another.imag);
		this.setImag(this.real * another.imag + this.imag * another.real);
		return this;
	}
	
	public MyComplex divideBy(MyComplex another) {
		double anotherSq = Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2);
		this.setReal(this.multiplyWith(another).getReal() / anotherSq);
		this.setImag(this.multiplyWith(another).getImag() / anotherSq);
		return this;
	}
}
