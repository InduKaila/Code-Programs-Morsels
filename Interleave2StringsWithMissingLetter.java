/**
 * Interleave 2 strings that have the same length and omit every second letter.
 * 
 * @author indu
 */

public class Interleave2StringsWithMissingLetter {
	/**
	 * @param userSourceString1
	 *            the first string to be interleaved
	 * @param userSourceString2
	 *            the second string to be interleaved
	 * @return the first string interleaved with the second string
	 */
	public static String interleave(String userSourceString1,
			String userSourceString2) {

		int index = 0;
		String newString = "";

		for (; index < userSourceString1.length(); index += 2) {
			newString = newString + userSourceString1.charAt(index);
			newString = newString + userSourceString2.charAt(index);

		}
		return newString;
	}

	/**
	 * Invokes the {@link #interleave(String, String)} method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.print(interleave("abcd", "efgh"));
	}
}
