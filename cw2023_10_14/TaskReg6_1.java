public class TaskReg6_1 {
	public static boolean isGlas(char c) {
		return (c == 'A' || c == 'Y' || c == 'E' || c == 'U' || c == 'I' || c == 'O');
	}
	public static void main(String[] args) {
		String line = "Atiojigjoqwie124B";
		int s = 0;
		String gl = "AEYUIO";
		int i = 0;
		char c = 'a';
		int n = line.length();
		while (i < n && s != -1) {
			c = line.charAt(i);
			if (s == 0) {
				if (isGlas(c)) {
					s = 1;
				} else {
					s = -1;
				}
			} else if (s == 1) {
				if (isGlas(c)) {
					s = 2;
				} else {
					s = 1;
				}
			} else if (s == 2) {
				if (Helper.check('a','z',c)) {
					s = 1;
				} else {
					s = 2;
				}
			}
			i++;
		}

		if (s == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}