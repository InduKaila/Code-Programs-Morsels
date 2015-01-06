/**
 * @param args
 */
public class InterleaveStringsButIsLimited {

	public static String interleaver(String userSource1, String userSource2) {

		String newString = "";

		for (int index = 0; index < userSource1.length(); index++) {
			newString = newString + userSource1.charAt(index)
					+ userSource2.charAt(index);
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(interleaver("bac", "bacon")); // Gives bbaacc as the
															// length of
															// userSource1 is 3
		// and the for loop goes through doing index 0's, then index 1's, then
		// index 2's for userSource1 then
		// userSource2 alternately
		// System.out.println(interleaver("aaaaaa", "ccc")); Throws an exception
		// as userSource1 is longer than userSource2
	}
}