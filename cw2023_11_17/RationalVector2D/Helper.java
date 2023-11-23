public class Helper {
	public static boolean isCoordsEquals(double x1, double x2) {
		return Math.abs(x1-x2) < 1e-8;
	}

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