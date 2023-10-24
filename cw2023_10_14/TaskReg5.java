import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskReg5 {
	public static void main(String [] args) {
		String line = "OOOFF";
		int sogl = 0;
		int gl = 0;
		Pattern pGlass = Pattern.compile("[AEYUIOaeyuio]");
		Pattern pLet = Pattern.compile("[A-Za-z]");
		for (int i = 0; i < line.length(); i++) {
			String c = line.charAt(i) + "";
			Matcher m = pLet.matcher(c);
			if (m.matches()) {
				Matcher check = pGlass.matcher(c);
				if (check.matches()) {
					gl++;
				} else {
					sogl++;
				}
			}
		}

		if (gl > sogl) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}