public class TaskReg8 {
	public static void main(String [] args) {
		String line = "((hello))!";
		int k = 0;
		int i = 0;
		while (i < line.length()) {
			char c = line.charAt(i);
			if (c == '(') {
				k++;
			} else if (c == ')') {
				k--;
			}
			i++;
		}

		if (k == 0 && line.length() > 0) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}
	}
}