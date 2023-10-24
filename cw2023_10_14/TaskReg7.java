import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TaskReg7 {
	public static void main(String [] args) {
		String line = args[0];
		Boolean p = Pattern.compile("[A-Za-z][A-Za-z0-9_-]*").matcher(line).matches();
		System.out.println(p);
	}
}