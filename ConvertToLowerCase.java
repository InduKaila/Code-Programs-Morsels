public class ConvertToLowerCase {

	/**
	 * @param args
	 */

	public static String lowerCaseConverter(String userSource) {
		int index = 0;
		String newString = "";

		for (; index < userSource.length(); index++) {
			char ch = userSource.charAt(index);
			ch = Character.toLowerCase(ch);
			newString = newString + ch;
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(lowerCaseConverter("HELLO"));
	}
}
