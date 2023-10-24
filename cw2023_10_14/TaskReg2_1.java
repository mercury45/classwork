
public class TaskReg2_1 {
	public static boolean check(char st, char end, char c) {
		return (st <= c && c <= end);
	}

	public static void main(String [] args) {
		String line = args[0];
		int s = 0;
		int i = 0;
		int n = line.length();
		char c;

		while (i < n && s != -1) {
			c = line.charAt(i);
			if (s == 0) {
				if (c == '+' || c == '-') {
					s = 1;
				} else if (c == '0') {
					s = 4;
				} else if (check('0','9',c)) {
					s = 3;
				} else {
					s = -1;
				}
			}	else if (s == 1) {

				if (check('1','9',c)) {
					s = 3;

				} else {
					s = -1;
				}
			} else if (s == 3) {
				if (check('0','9',c)) {
					s = 3;
				} else {
					s = -1;
				}
			} else if (s == 4) {
				if (n != 1) {
					s = -1;
				} else if (s == 4) {
					s = 4;
				}
			}

			i++;
		}
		if (s == 3 || s == 4) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}
	}
}