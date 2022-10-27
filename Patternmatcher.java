import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatcher {

	public static void main(String[] args) {


	Pattern pat=Pattern.compile("IS",Pattern.CASE_INSENSITIVE);
		
		
		Matcher m=pat.matcher("Teleapps is a good company");
		
		
		while(m.find())
			
		{
			System.out.println(m.start()+" "+m.end());
		}
	}

	
}
