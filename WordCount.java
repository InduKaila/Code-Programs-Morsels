public class WordCount {

	/**
	 * @param args
	 */

	public static int countWords(String[] stringArray) {
		int wordCount = 0;

		for (int index = 0; index < stringArray.length; index++) {
			wordCount = stringArray.length;
		}
		return wordCount;
	}

	public static void main(String[] args) {
		String[] arrayToBeUsed = { "bacon", "banana", "pineapple", "plums" };
		System.out.println(countWords(arrayToBeUsed));
	}
}
