package string.io.formatting.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		String str = "yyxxxyxx";
		findMatching(str, ".*xx");	//Greedy Quantifier
		findMatching(str, ".*?xx"); //Reluctant Quantifier
	}

	private static void findMatching(String str, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		StringBuilder output = new StringBuilder();
		while(matcher.find()){
			output.append("("+matcher.group()+")\t");
		}
		System.out.println(output);
	}
}
