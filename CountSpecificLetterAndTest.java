/**
 */
public class CountSpecificLetterAndTest {
	/**
	 * Returns the number of times the supplied letter appears in the supplied
	 * string. The comparison is case sensitive (i.e. A is not the same as a).
	 * 
	 * @param word
	 *            sample string
	 * @param targetLetter
	 *            target letter
	 * 
	 * @return the number of times the target letter appears in the sample
	 *         string
	 */
	private static int countLetters(String word, char targetLetter) {
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if (currentLetter == targetLetter)
				count++;
		}
		return count;
	}

	// Created a test
	private static void test(String w, char ch, int expected) {
		int result = countLetters(w, ch);
		if (result == expected)
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	public static void main(String[] args) {
		test("", 'a', 0);
		test("a", 'b', 0);
		test("a", 'a', 1);
		test("Milo", 'i', 1);
		test("Milo", 'M', 1);
		// case sensitive!
		test("Milo", 'm', 0);
		test("Truffle", 'e', 1);
		test("Truffle", 'f', 2);
		test("banana", 'n', 2);
		test("banana", 'a', 3);
	}
}
