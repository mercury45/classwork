public class Task1ANew {
	public static void main(String [] args) {
		int n = args.length - 1;
		int x = Integer.parseInt(args[0]);

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++ ) {
			a[i] = Integer.parseInt(args[i+1]);
		}

		int left = 0;
		int right = n;
		int mid = (right + left) / 2;
		boolean has = false;
		while ((left <= right) && (has == false)) {
			if (x == a[mid]) {
				has = true;
				System.out.println("Element found in index: " + mid);
			}

			if (a[mid] <= x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			
			mid = (right + left) / 2;	

		}

		if (!has) {
			System.out.println("no your number");
		}
	}
}