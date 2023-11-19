public class Helper {
	public static int euqlid(int x, int y) {
		int nod = 0;
		x = Math.abs(x);
		y = Math.abs(y);
		while (x != y && (x*y != 0)) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}

		nod = x;

		return nod;
	}


}