public class ConvertToUpperCase {
	/**
	 * @param args
	 */

	public static String upperCaseConverter(String userSource) {
		int index = 0;
		String newString = "";

		for (; index < userSource.length(); index++) {
			char ch = userSource.charAt(index);
			ch = Character.toUpperCase(ch);
			newString = newString + ch;
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(upperCaseConverter("hello"));
	}
}
