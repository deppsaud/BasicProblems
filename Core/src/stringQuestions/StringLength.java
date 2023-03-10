package stringQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//how to find length of String in java without using length method

public class StringLength {
	public static void main(String[] args)
	{
		String str = "HelloWorld";
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));
		
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		
		System.out.println(len);
		System.out.println(str.split("").length);
	}

}
