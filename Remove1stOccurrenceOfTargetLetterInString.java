/**
 */
public class Remove1stOccurrenceOfTargetLetterInString {
	/**
	 * Returns a string removing the first occurrence of the target letter
	 * from the sample string. Any subsequent occurrences of the target
	 * letter in the string are left in place. The comparison is case
	 * sensitive (i.e. A is not the same as a).
	 * 
	 * @param word     sample string
	 * @param letter   target letter
	 * 
	 * @return the sample string, minus the first occurrence of the target
	 *         letter
	 */
	private static String removeFirstLetter(String word, char letter) {
		boolean firstLetterNotRemoved = true;
		String result = "";
		int i = 0;

		while (firstLetterNotRemoved && i < word.length()) {
			char thisLetter = word.charAt(i);
			if (thisLetter == letter) {
				firstLetterNotRemoved = false;
			} else {
				result = result + thisLetter;
			}

			i++;
		}

		for (; i < word.length(); i++)
			result += word.charAt(i);

		return result;
	}

	private static void test(String w, char ch, String expected) {
		String result = removeFirstLetter(w, ch);
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
		test("Truffo", 'f', "Trufo");
		test("Truggfog", 'g', "Trugfog");
		test("banana", 'n', "baana");
		test("banana", 'a', "bnana");
	}
}