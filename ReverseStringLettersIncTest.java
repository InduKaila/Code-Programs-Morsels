/**
 */
public class ReverseStringLettersIncTest {
	/**
	 * Returns a string consisting of the letters of the sample string in
	 * reverse order.
	 * 
	 * @param word sample string
	 * 
	 * @return the sample string in reverse order
	 */
	private static String reverse(String word) {
		String result = "";

		for (int i = 0; i < word.length(); i++) {
			char thisLetter = word.charAt(i--);
			result += thisLetter;

		}
		return result;
	}

	private static void test(String w, String expected) {
		String result = reverse(w);
		if (result.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	// Created a test
	public static void main(String[] args) {
		test("", "");
		test("a", "a");
		test("Milo", "oliM");
		test("Trufo", "ofurT");
		test("Chocolate eclair", "rialce etalocohC");
	}
}
