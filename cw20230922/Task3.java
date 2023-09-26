import java.util.Scanner;


public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// Integer.parseInt(args[0]);
		int s = 0;
		for (int k = 1; k <= n; k++) {
			s += k*k;
			int TwoDegree = 2;
			for (int i = 1; i < k; i++) {
				TwoDegree *= 2;
			}
			s += TwoDegree;
		}
		System.out.print(s);
	}
}