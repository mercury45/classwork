public class Task0 {
	public static void main(String [] args) {
		int n = args.length; 
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}


		int mx = a[0];
		for (int i = 1; i < a.length; i++ ) {
			
			if (mx < a[i]) {
				mx = a[i];
			}
		}
		System.out.println(mx);
	}
}