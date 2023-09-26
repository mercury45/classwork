public class Task2 {
	public static void main(String[] args) {
		int n = 1;
		double a = Math.sqrt(n+1) - Math.sqrt(n);
		double aOld;
		final double EPS = 1e-6;
		do {
			n +=1;
			aOld = a;
			a = Math.sqrt(n+1) - Math.sqrt(n);
		} while (Math.abs(a- aOld) > EPS );
		System.out.print("Limit= " + a);
	}
}