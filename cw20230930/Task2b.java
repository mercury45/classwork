

public class Task2b {
	public static void main(String [] args) {
		int n = 10;

		double [] a = {1,2,3,4,5,6,7,8,9,10};
		double [] b = {1,1,1,1,1,1,1,1,1,2};

		double product = 0;

		double firstVector = 0;
		double secondVector = 0;
		for (int i = 0; i < n; i++) {
			product += a[i]*b[i];
			firstVector += a[i]*a[i];
			secondVector += b[i]*b[i];
		}

		double cos = product/firstVector/secondVector;

		System.out.println(Math.acos(cos));
	}
}