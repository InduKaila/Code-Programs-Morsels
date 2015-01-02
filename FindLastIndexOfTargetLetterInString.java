/**
 */
public class FindLastIndexOfTargetLetterInString {
	/**
	 * Returns the last position of the target letter in the supplied string or
	 * -1 if the letter does not appear at all. The position is zero-based so
	 * the index of the first letter is 0. The comparison is case sensitive
	 * (i.e. A is not the same as a).
	 * 
	 * @param word  sample string
	 * @param letter  target letter
	 * 
	 * @return the index of the last occurrence of the target letter in the
	 *     sample string; -1 if the letter does not appear in the string
	 */
	private static int lastIndex(String word, char letter) {
		int latestIndex = -1;
		for (int i = 0; i < word.length(); i++) {

			char thisLetter = word.charAt(i);
			if (thisLetter == letter) {
				latestIndex = i;

			}
		}
		return latestIndex;
	}

	private static void test(String w, char ch, int expected) {
		int result = lastIndex(w, ch);
		if (result == expected)
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	// Created a test
	public static void main(String[] args) {
		test("", 'a', -1);
		test("a", 'b', -1);
		test("a", 'a', 0);
		test("Milo", 'i', 1);
		test("Milo", 'M', 0);
		// case sensitive!
		test("Milo", 'm', -1);
		test("Truffle", 'f', 4);
		test("banana", 'n', 4);
		test("banana", 'a', 5);
	}
}
