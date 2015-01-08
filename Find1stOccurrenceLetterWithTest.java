/**
 */
public class Find1stOccurrenceLetterWithTest {
	/**
	 * Returns the first position of the target letter in the supplied string or
	 * -1 if the letter does not appear at all. The position is zero-based so
	 * the index of the first letter is 0. The comparison is case sensitive
	 * (i.e. A is not the same as a).
	 * 
	 * @param word
	 *            sample string
	 * @param targetLetter
	 *            target letter
	 * 
	 * @return the index of the first occurrence of the target letter in the
	 *         sample string; -1 if the letter does not appear in the string
	 */
	private static int firstIndex(String word, char targetLetter) {

		int count = 0;
		String result = "";

		for (int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			result += word.charAt(i);
			if (currentLetter == targetLetter)

				return i;

		}
		return -1;
	}

	private static void test(String w, char ch, int expected) {
		int result = firstIndex(w, ch);
		if (result == expected)
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	public static void main(String[] args) {
		test("", 'a', -1);
		test("a", 'b', -1);
		test("a", 'a', 0);
		test("Milo", 'i', 1);
		test("Milo", 'M', 0);
		// case sensitive!
		test("Milo", 'm', -1);
		test("Truffle", 'f', 3);
		test("banana", 'n', 2);
		test("banana", 'a', 1);
	}
}
