// Interleaving the letters of 2 strings (the 2 strings have the same length)

public class InterleaveTwoStrings {
	public static String interleaver(String string1FromUser,
			String string2FromUser) {
		// abcd
		// defg
		// adbecfdg
		// 00112233

		int index = 0;
		String newString = "";

		for (; index < string1FromUser.length(); index++) {
			newString = newString + string1FromUser.charAt(index)
					+ string2FromUser.charAt(index);
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(interleaver("abcd", "defg"));
	}
}
