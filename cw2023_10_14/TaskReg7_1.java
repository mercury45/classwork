public class TaskReg7_1 {
	public static boolean isPossible(char c) {
		return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || (c == '_') || (c == '-'));
	}

	public static void main(String [] args) {
	 	String line = "ASGMKLG = -2935 + -1235;";
	 	int i = 0;
	 	int n = line.length();
	 	int s = 0;
	 	char c = 'a';
	 	while (i < n && s != -1) {
	 		c = line.charAt(i);
	 		if (s == 0) {
	 			if (isPossible(c)) {
	 				s = 1;
	 			} else {
	 				System.out.println(c);
	 				s = -1;
	 			}
	 		} else if (s == 1) {
	 			if (isPossible(c) || '0' <= c && c <= '9') {
	 				s = 1;
	 			} else if (c == ' ') {
	 				s = 2;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 2) {
	 			if (c == '=') {
	 				s = 100;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 100) {
	 			if (c == ' ') {
	 				s = 3;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 3) {
	 			if (isPossible(c)) {
	 				s = 31;
	 			} else if ('1' <= c && c <= '9') {
	 				s = 4;
	 			} else if (c == '-') {
	 				s = 6;
	 			} else if (c == ';') {
	 				s = 505;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 6) {
	 			if ('1' <= c && c <= '9') {
	 				s = 4;
	 			} else if (isPossible(c)) {
	 				s = 31;
	 			}
	 		} else if (s == 31) {
	 			if (isPossible(c) || '0' <= c && c <= '9') {
	 				s = 31;
	 			} else if (c == ' ') {
	 				s = 5;
	 			} else if (c == ';') {
	 				s = 505;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 4) {
	 			if ('0' <= c && c <= '9') {
	 				s = 4;
	 			} else if (c == ' ') {
	 				s = 5;
	 			} else if (c == ';') {
	 				s = 505;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 5) {
	 			if (c == '+' || c == '-' || c == '/' || c == '*') {
	 				s = 100;
	 			} else {
	 				s = -1;
	 			}
	 		} else if (s == 505) {
	 			s = -1;
	 		}
	 		i++;
	 		System.out.println(s + " " + c);
	 	}

	 	if (s == -1) {
	 		System.out.println("false");
	 		System.out.println(c);
	 		System.out.println(s);
	 	} else if (s == 505) {
	 		System.out.println("true");
	 	}
	}
}