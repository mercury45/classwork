import java.util.Scanner;

public class Task2a {
	public static void main(String [] args) {
		int n = 10;

		double [] a = {1,2,3,4,5,6,7,8,9,10};
		double [] b = {1,1,1,1,1,1,1,1,1,1};
		double s = 0;
		for (int i = 0; i < n; i++) {
			s += a[i]*b[i];
		}
		System.out.println(s);
	}
}