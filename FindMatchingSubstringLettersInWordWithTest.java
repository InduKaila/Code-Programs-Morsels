/**
 */
public class FindMatchingSubstringLettersInWordWithTest {
	/**
	 * Determines if the letters in the substring are the same as those in the
	 * supplied word starting at the supplied position. For example, given the
	 * word "Oskar" and the substring "kar", the method returns false for
	 * positions 0 and 1, but true for position 2.
	 * 
	 * @param word
	 *            sample word
	 * @param substring
	 *            substring
	 * @param position
	 *            position in sample word from which to begin comparison.
	 * @return true if the substring matches; false otherwise
	 */
	// position is where word letter and substring letter match
	private static boolean matchesAt(String word, String substring, int position) {
		for (int i = 0; i < substring.length(); i++) {
	
			char substringLetter = substring.charAt(i);
			char wordLetter = word.charAt(i + position);

			if (substringLetter != wordLetter)
				return false;
		}
		return true;
	}

	/**
	 * Returns true if the letters of the supplied substring appear, in order,
	 * in the supplied word. Both sample word and substring must be non-empty!
	 * 
	 * @param word   sample word
	 * @param 	substring
	 *            target substring
	 * 
	 * @return true if the substring appears in the word; false otherwise.
	 */
	private static boolean contains(String word, String substring) {
		int limit = word.length() - substring.length();

		for (int i = 0; i <= limit; i++) {
			if (matchesAt(word, substring, i))
				return true;
		}
		return false;
	}

	private static void test(String word, String substring, boolean expected) {
		boolean result = contains(word, substring);
		if (result == expected)
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	// Created a test
	public static void main(String[] args) {
		test("a", "b", false);
		test("a", "a", true);
		test("Milo", "M", true);
		// case sensitive!
		test("Milo", "m", false);
		test("Milo", "Mi", true);
		test("Milo", "ilo", true);
		test("Truffle", "ruffle", true);
		test("Trufo", "rofu", false);
		test("Trufo", "o", true);
	}
}
