import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskReg6 {
	public static void main(String [] args) {
		String line = args[0];
		Boolean p = Pattern.compile("[AYUIOE].*[AEYUIO]").matcher(line).matches();
		System.out.println(p);
	}
}