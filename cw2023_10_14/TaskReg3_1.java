public class TaskReg3_1 {

	public static boolean check(char st, char end, char c) {
		return (st <= c && c <= end);
	}

	public static void main(String [] args) {
		String line = "+7-261-215-25-25";
		int s = 0;
		int i = 0;
		int n = 1;
		int seq = 0;
		char c;
		while (i < line.length() && s != -1){
			c = line.charAt(i);
			if (s == 0) {
				if (c == '+') {
					s = 1;
				} else {
					s = -1;
				}
			} else if (s == 1) {
				if (c == '7') {
					s = 2;
				} else {
					s = -1;
				}
			} else if (s == 2) {
				if (c == '-') {
					s = 3;
				} else {
					s = -1;
				}
			} else if (s == 21) {
				if (c == '-') {
					s = 31;
				} else {
					s = -1;
				}
			} else if (s == 31) {
				if (check('0','9',c) && n < 2) {
					s = 31;
					n += 1;
				} else if (n == 2) {
					s = 21;
					seq += 1;
					n = 1;
				} else {
					s = -1;
				}
				if (seq == 2) {
					s = 5;
				}
			} else if (s == 3) {
				if (check('0','9',c) && n < 3) {
					s = 3;
					n += 1;
				} else if (n == 3) {
					s = 2;
					seq += 1;
					n = 1;
				} else {
					s = -1;
				}
				if (seq == 2) {
					seq = 0;
					s = 21;
				}
			}
			System.out.println(s + " " + c);
			i++;
		}

		if (s == -1) {
			System.out.println("not equal");
		} else if (s == 5) {
			System.out.println("right");
		}
	}
}