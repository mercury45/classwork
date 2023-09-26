public class Task6 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int s = 0;
		int q;
		/* for (int i = 1; i <= m; i++) {


			if (i % 2 == 1) {
				q = (n % 4 == 0 || n % 4 == 1) ? 1 : -1;
			} else {
				q = (n % 4 == 0 || n % 4 == 3) ? 1 : -1;
			}
			s += q;
		} 	*/

		int i2 = m/2;
		int p2 = (n % 4 == 0 || n % 4 == 3) ? 1 : -1;
		int i1 = m - i2;
		int p1 = (n % 4 == 0 || n % 4 == 1) ? 1 : -1;
		int s = i1 * p1 + i2 * p2;
	}
}