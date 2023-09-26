public class Task3 {
	public static void main(String[] args) {
		// 51 demidovich
		int n = 1;
		double a = (n-1)*2*n;
		double aOld;
		final double EPS = 1e-30;
		do {
			n +=1;
			aOld = a;
			a = (n-1.0)/(2*n);
		} while (Math.abs(a- aOld) > EPS );
		System.out.print("Limit= " + a);
	}
}