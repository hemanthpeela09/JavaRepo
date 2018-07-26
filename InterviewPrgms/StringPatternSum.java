import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac1Test {

	public static void main(String[] args) {
		String input = "Hemanth1 value2 teen5 trip3";
		
		Pattern pattern = Pattern.compile("[\\d]");
	    Matcher matcher = pattern.matcher(input);
	    int sum = 0;
	    while(matcher.find()) {
	        sum += Integer.parseInt(matcher.group());
	    }
		
		System.out.println(sum);
	}
}
