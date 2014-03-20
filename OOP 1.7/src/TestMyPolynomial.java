
public class TestMyPolynomial {

	public static void main(String args[]) {
		MyPolynomial poly = new MyPolynomial(1, 2, 3);
		MyPolynomial pola = new MyPolynomial(1, 2);
		
		System.out.println();
		System.out.println("Poly is " + poly);
		System.out.println("Pola is " + pola);
		
		System.out.println();
		System.out.println("Added is " + poly.add(pola));
		System.out.println(poly.getDegree() + pola.getDegree());
		System.out.println("Multi is " + poly.multiply(pola));
	}
}
