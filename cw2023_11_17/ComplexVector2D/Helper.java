public class Helper {
	public static boolean isCoordsEquals(double x1, double x2) {
		return Math.abs(x1-x2) < 1e-8;
	}


	public static double round(double x) {
		return Math.round(x * 100000000) / 100000000.0;
	}


}