public class TaskReg1_1 {
	public static void main(String [] args) {
		String line = "()";
		int n = line.length();
		int s = 0;
		int i = 0;
		char sym;
		while ( (i < n) && (s != -1) ) {
			sym = line.charAt(i);
			if (s == 0) {
				if (('1' <= sym) && (sym <= '9')) {
					s = 1;
				}
				else {
					s = -1;
				}
			} else if (s == 1) {
				if (('0' <= sym) && (sym <= '9')) {
					s = 1;
				} else {
					s = -1;
				}
			} else if (s == -1) {
				break;
			}
			
			i++;
		}

		if (s == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
	}
}