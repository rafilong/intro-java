
public class stringTimes {

	public static String stringTimes(String str, int n) {
		  String strPlus = "";
		  for(int i = 0; i < n; i++) {
		    strPlus += str;
		    }
		  return strPlus;
	}
	
	public static void main(String[] args) {	
		String foo = stringTimes("Tyler", 100);
		System.out.println(foo);
	}
}
