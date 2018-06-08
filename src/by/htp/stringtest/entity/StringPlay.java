package by.htp.stringtest.entity;

import java.util.ArrayList;
import java.util.List;
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
	/**
	 * This method deletes all symbols "symbol" in the lines of "text" marked as "0"
	 * This method adds symbol "symbol" to every position "insert_position"+1 in the lines of "text" marked as "1"
	 * Position zero(position of marker) in this case does not count.
	 * If a line is not marked "0" or "1" it is not changed.
	 * @param text
	 * @param symbol
	 * @param insert_position
	 */
	public static void deleteOrAddSymbol(String text, String symbol, int insert_position) {
		//Pattern to find "symbol" in "text"
		String pat_p1 = "["+symbol+"]";
		Pattern p1 = Pattern.compile(pat_p1);
		
		// Extracting lines from text and place them into ArrayList
		Pattern p2 = Pattern.compile("^.*$",Pattern.MULTILINE);
		Matcher m2 = p2.matcher(text);
		List<String> arrLines = new ArrayList<String>();
		while(m2.find()) {
			arrLines.add(m2.group());	
		}
		
		//Doing changes
		for (int i = 0; i < arrLines.size(); i++) {
			String string = arrLines.get(i);
			System.out.println("Before:"+string);
			if(string.charAt(0)=='0') {
				string = p1.matcher(string).replaceAll("");
				arrLines.remove(i);
				arrLines.add(i, string);
				System.out.println(string);
			}
			if(string.charAt(0)=='1') {
				StringBuilder sb = new StringBuilder();
				sb.append(string.charAt(0));
				for (int j = 1; j < string.length(); j++) {
					sb.append(string.charAt(j));
					if(j%insert_position==0) {
						sb.append(symbol);
					}
					
				}
				arrLines.remove(i);
				arrLines.add(i, sb.toString());
			}
		}
		
		//Printing result
		System.out.println("Changed text:");
		StringBuilder sb = new StringBuilder();
		for (String string : arrLines) {
			sb.append(string).append("\n");
		}
		System.out.println(sb);
	}

	
	
	
}
