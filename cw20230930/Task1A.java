public class Task1A {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++ ) {
			a[i] = Integer.parseInt(args[i+2]);
		}

		boolean has = false;
		int place = a.length;
		int prevlen = a.length;
		while ((has != true) || (place != 0)) {
			prevlen = place;
			place /= 2;
			if (a[place] == x) {
				has = true;
			} else{
				if (x > a[place]) {
					place = place + (prevlen - place) / 2;
				} else {
					place = place / 2
				}
			}
		}

		if (has == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		
	}
}