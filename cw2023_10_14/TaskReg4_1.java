public class TaskReg4_1 {
	public static boolean check(char st, char end, char c) {
		return (st <= c && c <= end);
	}

	public static void main(String [] args) {
		String line = args[0];
		int s = 0;
		int n = line.length();
		int i = 0;
		char c;
		while (i < n && s != -1) {
			c = line.charAt(i);
			if (s == 0) {
				if (c == '1') {
					s = 1;
				} else {
					s = -1;
				}
			

			} else if (s == 1) {
				if (c == '4') {
					s = 21;
				} else if (check('5','8',c)) {
					s = 22;
				} else if (c == '9') {
					s = 23;
				} else {
					s = -1;
				}
			} else if (s == 21) {
				if (c == '9') {
					s = 31;
				} else {
					s = -1;
				}
			} else if (s == 22) {
				if (check('0','9',c)) {
					s = 32;
				} else {
					s = -1;
				}
			} else if (s == 23) {
				if (check('0','6',c)) {
					s = 33;
				} else {
					s = -1;
				}
			} else if (s == 31) {
				if (check('2','9',c)) {
					s = 4;
				} else {
					s = -1;
				}
			} else if (s == 32) {
				if (check('0','9',c)) {
					s = 4;
				} else {
					s = -1;
				}
			} else if (s == 33) {
				if (check('0','2',c)) {
					s = 4;
				} else {
					s = -1;
				}
			}

			i++;
		}

		if (s == 4 && n == 4) {
			System.out.println("yes");
		} else if (s == -1) {
			System.out.println("no");
		} else {
			System.out.println("NO");
		}
	}
}