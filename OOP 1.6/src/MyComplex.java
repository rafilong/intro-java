
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
}
