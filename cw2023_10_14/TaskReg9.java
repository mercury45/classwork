import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskReg9 {
	public static void main(String [] args) {
		String line = "Hello = 8 * 9 / 3 / 2;"; // Natural = num1 + 1;
		System.out.println(line);
		Boolean p = Pattern.compile("[A-Za-z][A-Za-z0-9_0-]* = (([A-Za-z][A-Za-z0-9_0]*|0|[1-9][0-9]*)( [+-/*] ([A-Za-z][A-Za-z0-9_0]*|0|[1-9][0-9]*))?) [+-/*] (([A-Za-z][A-Za-z0-9_0]*|0|[1-9][0-9]*)( [+-/*] ([A-Za-z][A-Za-z0-9_0]*|0|[1-9][0-9]*))?);").matcher(line).matches();
		System.out.println(p);
	}
}	