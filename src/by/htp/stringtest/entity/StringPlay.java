package by.htp.stringtest.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlay {
	/**
	 * Replaces words of length "word_length" in text "text" by word "replacement".
	 * Words to replace should consist of [a-za-Z0-9_]
	 * @param text
	 * @param word_length
	 * @param replacement
	 */
	public static void replaceWords(String text, int word_length, String replacement) {
		String num =new Integer(word_length).toString();
		String pattern = "\\b[\\w]{"+num +"}\\b"; 
		Pattern p = Pattern.compile(pattern,Pattern.MULTILINE);
		Matcher m = p.matcher(text);
		text = m.replaceAll(replacement);
		System.out.println("Changed text:");
		System.out.println(text);
	}

}
