import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskReg3 {
	public static void main(String [] args) {
		Pattern p = Pattern.compile("[+]7([-]([0-9]){3}){2}([-][0-9]{2}){2}");
		Matcher m = p.matcher("+7-133-402-52-70");
		System.out.println(m.matches());
	}
}