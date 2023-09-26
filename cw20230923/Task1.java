public class Task1 {
	public static void main(String[] args) {
			double diff = 100;
			double prevRes = 0;
			// int n = 1;
			double res = 0;
			// while (diff >= 1.0e-7) {
			// 	res = (10000*n / ((double)(n*n + 1)));
				
			// 	diff = Math.abs(prevRes - res);
				
			// 	prevRes = (double)	res;
			// 	n++;
			// }
			// System.out.print(res);

			for (int n=1; diff >= 1.0e-4; n++) {
				res = (10000*n) / (double)(n*n + 1);
				diff = Math.abs(res-prevRes);
				prevRes = res;
				

			}
			System.out.println(res);
	}
}	

