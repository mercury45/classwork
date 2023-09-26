public class Exp {
	public static void main(String [] args) {

		double s = 0;
		final double EPS = 1e-5;
		int x = 1;
		int fact = 1;
		double deg = 1;
		double a = deg / fact;
		int k = 0;
		while (Math.abs(a) > EPS) {
			s += a;
			k += 1;
			fact *= k;
			deg *= x;
			a = deg / fact;
		}  
		System.out.println(s);

	}
}