public class RemoveDuplicateLettersWithTest {
	/**
	 * @param args
	 */

	private static String uniqueLetters(String word) {

		String unique = "";

		for (int index = 0; index < word.length(); index++) {
			char thisLetter = word.charAt(index);

			if (unique.indexOf(thisLetter) < 0) {

				unique = unique + thisLetter;
			}
		}
		return unique;
	}

	private static void test(String w, String expected) {
		String unique = uniqueLetters(w);
		if (unique.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + unique + ">");
	}

	// Created a test
	public static void main(String[] args) {
		test("hello", "helo");
		test("banana", "ban");
		test("custard", "custard");
		test("dumplings", "dumplings");
		test("apple", "aple");
		test("coffee", "cofe");
		// case sensitive!
		test("sWEEt", "sWEt");
		test("Mellow", "Melow");
		test("Pineapple", "Pineapl");
		test("Butter", "Buter");
	}
}
