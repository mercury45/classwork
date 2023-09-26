public class Task5 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int [] a2 = new int[n + 1];
		a2[0] = 0;
		int deg = 1;
		for (int i = 1; i<=n; i++ ) {
			deg *= 2;
			a2[i] = deg;
		}

		int s = 0;
		for (int i = 1; i <= m; m++) {
			int p = 1;
			for (int j = 1; j <= n; j++ ) {
				p *= (a2[j]+i);
			}
			s += p;
		}
		System.out.print(s);
	}
}