public class TaskNatural {
	public static void main(String[] args) {
		double s = 0;
		int n = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);
		
		int k = 0;
		double res = 0;
		// while (k * k <n) {
			
		// 	k++;
		// }
		// res = k-1; // btw k-1 and k

		// while (res * res <= n) {
		// 	res += 0.1;
		// }
		double d = 1;
		for (int i = 1; i <= e; i++ ){
			
			while (res*res <= n) {
				res += d;	
			}
			res -= d;
			d = d / 10;	

		}
		System.out.println(res);

	}

}