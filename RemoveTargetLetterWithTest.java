/**
 */
public class RemoveTargetLetterWithTest {
	/**
	 * Returns a string in which all occurrences of the target letter have been
	 * removed from the sample string. The comparison is case sensitive (i.e. A
	 * is not the same as a).
	 * 
	 * @param word
	 *            sample string
	 * @param targetLetter
	 *            target letter
	 * 
	 * @return the sample string, minus the target letter
	 */
	private static String removeLetters(String word, char targetLetter) {

		String result = "";
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char thisLetter = word.charAt(i);

			if (thisLetter != targetLetter)
				result = result + word.charAt(i);

		}
		return result;
	}

	private static void test(String w, char ch, String expected) {
		String result = removeLetters(w, ch);
		if (result.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	// Created a test
	public static void main(String[] args) {
		test("", 'a', "");
		test("a", 'b', "a");
		test("a", 'a', "");
		test("Milo", 'i', "Mlo");
		test("Milo", 'M', "ilo");
		// case sensitive!
		test("Milo", 'm', "Milo");
		test("Truggfog", 'g', "Trufo");
		test("Truffle", 'f', "Trule");
		test("banana", 'n', "baaa");
		test("banana", 'a', "bnn");
	}
}
