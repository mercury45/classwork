public class Task4 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double s = 0;	
		double p = 2;
		double factorial = 1;
		int k = 1;
		while (k <= n) {
			s += (factorial/p);
			k++;
			factorial *= k;
			p *= 2;
		}


		System.out.print(s);
	}
}