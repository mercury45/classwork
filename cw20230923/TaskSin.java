public class TaskSin {
	public static void main(String [] args) {
		double s = 0;
		final double EPS = 1e-5;
		double x = Math.PI / 6;
		int fact = 1;
		double deg = x;
		int k = 1;
		int sign = 1;
		double a = sign * deg / fact;
		while (Math.abs(a) > EPS) {
			s += a;
			k += 1;
			fact *= (2 * k - 1) * (2 * k - 2);
			deg *= x * x;
			sign = -1 * sign;
			a = sign * deg / fact;
		}  
		System.out.println(s);

	}
}