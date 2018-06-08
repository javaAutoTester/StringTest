package by.htp.stringtest.run;

import by.htp.stringtest.entity.StringPlay;

public class StringApp {

	public static void main(String[] args) {
		
		/*
		 * git remote add origin git@github.com:javaAutoTester/StringTest.git
         * git push -u origin master
         * 
         * git remote add origin https://github.com/javaAutoTester/StringTest.git
		 */
		
		/* Task 1
		 * В тексте слова заданной длины заменить указанной подстрокой,
	     * длина которой может не совпадать с длиной слова.
		 */
		String text = "We all living i4 Americ9, America, America\nNo one living in China, China, China";
		String replacement = "%%%%";
		StringPlay.replaceWords(text, 2, replacement);
		
		/* Task 2
		 * В тексте после k-го символа вставить заданную подстроку.
		 */
		String text1 = "We all living i4 Americ9, America, America.\nNo one living in China, China, China";
		String addition = "@";
		StringPlay.addWord(text1, 45, addition);
		
		/* Task 3
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
		
		/* Task 4
		 * Из текста удалить все слова заданной длины, начинающиеся на
         *согласную букву.
		 */
		String text3 = "We all living in America, America, America."
		             + "\nNo one living in China, China, China."
		             + "\nI want to live in this house."
		             + "\nWho is living in Brasil."
		             + "\nThere are very beautiful trees in your garden";
		int word_length = 4;
		StringPlay.deleteWords(text3, word_length);
		
	}
   
}
