public class InsertAIntoMiddleOfString {
	public static String insertA(String userSource) {

		int index = 0;
		String newString = "";
		int stringLength = userSource.length();
		int stringLengthHalved = stringLength / 2;

		for (; index < stringLength; index++) {
			char ch = userSource.charAt(index);
			// newString = newString + ch;

			if (index == stringLengthHalved) {
				newString = newString + "A";
			}
			newString = newString + ch;
		}
		return newString;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(insertA(""));
		System.out.println(insertA("philby"));
		System.out.println(insertA("hello"));
		System.out.println(insertA("a"));
		System.out.println(insertA("ab"));
	}
}
