import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskReg4 {
	public static void main(String [] args) {
		Pattern p = Pattern.compile("1((49[2-9])|([5-8][0-9]{2})|(9[1-6][12]))");
		Matcher m = p.matcher("1550");
		System.out.println(m.matches());
	}
}