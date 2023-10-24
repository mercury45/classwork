import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TaskReg1 {
	public static void main(String [] args) {
		Pattern p = Pattern.compile("[1-9][0-9]*");
		Matcher m = p.matcher("1123");
		System.out.println(m.matches());
	}
}