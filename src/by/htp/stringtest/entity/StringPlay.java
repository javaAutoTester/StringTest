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
	
	/**
	 * Add symbol set "addition" after the symbol with index "index" in text "text"
	 * @param text
	 * @param index
	 * @param addition
	 */
	public static void addWord(String text, int index, String addition) {
		//replacing all new lines "\n" with "|"
		Pattern p2 = Pattern.compile("\\n");
		Matcher m2 = p2.matcher(text);
		text = m2.replaceAll("|");
		//adding "addition" to the right place
		Pattern p = Pattern.compile(".",Pattern.MULTILINE);
		Matcher m = p.matcher(text);
		StringBuilder sb = new StringBuilder();
		while(m.find()) {
			sb.append(m.group());
			if(m.start()==index) sb.append(addition);
		}
		//replacing back "|" by new lines "\n"
		text = sb.toString();
		Pattern p3 = Pattern.compile("\\|");
		Matcher m3 = p3.matcher(text);
		text = m3.replaceAll("\n");
		System.out.println("Changed text:");
		System.out.println(text);
	}

}
