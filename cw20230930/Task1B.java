public class Task1B {
	public static void main(String [] args) {
		int n = args.length - 1;
		int x = Integer.parseInt(args[0]);

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++ ) {
			a[i] = Integer.parseInt(args[i+1]);
		}

		boolean has = false;

		for (int i = 0;has == false && i < a.length; i++) {
			if (a[i] == x) {
				has	= true;
			}
			System.out.println(i);
		}

		if (has) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		
	}
}