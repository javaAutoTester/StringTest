package by.htp.stringtest.run;

import by.htp.stringtest.entity.StringPlay;

public class StringApp {

	public static void main(String[] args) {
		
		/* В тексте слова заданной длины заменить указанной подстрокой,
	     * длина которой может не совпадать с длиной слова.
		 */
		String text = "We all living i4 Americ9, America, America\nNo one living in China, China, China";
		String replacement = "%%%%";
		StringPlay.replaceWords(text, 2, replacement);
		
		/*
		 * В тексте после k-го символа вставить заданную подстроку.
		 */
		String text1 = "We all living i4 Americ9, America, America.\nNo one living in China, China, China";
		String addition = "@";
		StringPlay.addWord(text1, 45, addition);
		
		/*
		 * В зависимости от признака (0 или 1) в каждой строке текста
         *удалить указанный символ везде, где он встречается, или вста-
         *вить его после k-гo символа.
		 */
		String text2 = "0 We all living i4 Americ9, America, America."
				        + "\n1 No one living in China, China, China."
				        + "\nI want to live in the mountings."
				        + "\n0Who is living in Brasil.";
		String symbol = "i";
		int insert_position = 4;
		StringPlay.deleteOrAddSymbol(text2, symbol, insert_position);
	}
   
}
