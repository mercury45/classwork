public class Task1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int s = 0;
		for (int k = 1; k<=n;k++){
			s += k*k;
		}
		System.out.print(s);
	}
}