/**
 */
public class GenerateNoDuplicateLettersWithTest {
	/**
	 * Generates a string consisting of a *single instance* of each of the
	 * letters in the sample string. eg. the string "moonman" would give "mona".
	 * 
	 * 
	 * @param s1 sample string
	 * @return a string containing the unique letters in the sample string
	 */
	private static String uniqueLetters(String s1) {

		String unique = "";

		for (int i = 0; i < s1.length(); i++) {
			char letter = s1.charAt(i);

			// means if does not contain a letter (ie has an index less than index 0, meaning -1)
			if (unique.indexOf(letter) < 0) {

				unique = unique + letter;
			}
			// check whether the unique string already contains the letter and
			// only add it if it does not.
			// s1.indexOf(letter) will return a value less than zero if
			// the letter does not appear in the string
		}
		return unique;
	}

	private static void test(String s1, String expected) {
		String result = uniqueLetters(s1);
		if (result.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	// created a test
	public static void main(String[] args) {
		test("", "");
		test("a", "a");
		test("ab", "ab");
		test("truffo", "trufo");
		test("banana", "ban");
		test("toffee custard", "tofe cusard");
	}
}
