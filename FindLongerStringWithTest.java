/**
 */
public class FindLongerStringWithTest {
	/**
	 * Given two strings, return the longer. If both strings are the same
	 * length, program returns the first of the two.
	 * 
	 * @param s1
	 *            first string
	 * @param s2
	 *            second string
	 * @return the longer of the two.
	 */
	private static String getLonger(String s1, String s2) {
		if (s2.length() > s1.length())
			return s2;
		return s1;
	}

	private static void test(String s1, String s2, String expected) {
		String result = getLonger(s1, s2);
		if (result.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed. Expected: <" + expected
					+ "> but got <" + result + ">");

	}

	public static void main(String[] args) {
		test("", "", "");
		test("a", "b", "a");
		test("Chi", "Milo", "Milo");
		test("Milo", "Chi", "Milo");
		test("Chi", "Oskar", "Oskar");
		test("Oskar", "Milo", "Oskar");
		test("Philby", "Jasper", "Philby");
		test("Jasper", "Philby", "Jasper");
		test("Jasper", "B�rchen", "B�rchen");
		test("Philby", "Trufo", "Philby");
		test("Trufo", "Chi", "Trufo");
	}
}
