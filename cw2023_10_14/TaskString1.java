public class TaskString1 {
	public static void main(String [] args) {
		String s = "((Hello)";
		int i = 0;
		int n = s.length();
		int count = 0;

		while (i < n) {
			if (s.charAt(i).equals("(")) {
				count += 1;
			} else if (s.charAt(i).equals(")")) {
				count -= 1;
			}

			if (count < 0) {
				System.out.println("Wrong");
				break;
			}
			i++;
		}

		if (count == 0) {
			System.out.println("right");
		}


		
	}
}