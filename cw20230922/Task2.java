public class Task2 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]) ;
		int s = 0;
		for (int k = 1; k <= n; k++) {
			int TwoDegree = 2;
			for (int i = 1; i<k; i++){
				TwoDegree *= 2;
			}
			s += TwoDegree;
		}
		System.out.print(s);
	}
}