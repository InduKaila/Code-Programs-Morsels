/**
 */
public class CombineDifferentStringHalvesWithTest {
	/**
	 * Generates and returns a new string consisting of the letters from the first
	 * half of the first string and the second half of the second string. The two
	 * strings must be the same length for this to work.
	 * 
	 * @param s1
	 *          first string
	 * @param s2
	 *          second string
	 * @return a string containing the first half of s1 and the second half of s2.
	 */
	private static String halfAndHalf(String s1, String s2) {
		String result = "";
		int halfWay = s1.length() / 2;
			
		for (int i = 0; i < s1.length() / 2; i++) {
			result += s1.charAt(i);
		}
		
		for (int i = halfWay; i < s2.length(); i++)
			result += s2.charAt(i);
		
		return result;
	}

	private static void testHalfAndHalf(String s1, String s2, String expected) {
		String result = halfAndHalf(s1, s2);
		if (result.equals(expected))
			System.out.println("<" + s1 + ">, <" + s2 + "> - test passed");
		else
			System.out.println("<" + s1 + ">, <" + s2 + "> - test failed. Expected: <" + expected + "> but got <" + result + ">");

	}

	public static void main(String[] args) {
		testHalfAndHalf("", "", "");
		testHalfAndHalf("a", "b", "b");
		testHalfAndHalf("ab", "cd", "ad");
		testHalfAndHalf("abc", "def", "aef");
		testHalfAndHalf("Philby", "Jasper", "Phiper");
	}
}
