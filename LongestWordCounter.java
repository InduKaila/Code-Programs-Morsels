public class LongestWordCounter {

	/**
	 * @param args
	 */

	public static int countWords(String[] stringArray) {
		int wordCount = 0;

		for (int index = 0; index < stringArray.length; index++) {
			String thisWord = stringArray[index];
			if (wordCount < thisWord.length()) {
				wordCount = thisWord.length();
			}
		}
		return wordCount;
	}

	public static void main(String[] args) {
		String[] arrayToBeUsed = { "bacon", "banana", "pineapple" };
		System.out.println(countWords(arrayToBeUsed));
	}
}
