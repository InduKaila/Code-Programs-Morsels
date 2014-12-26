public class RemoveFirstLetter {

	/**
	 * @param args
	 */

	public static String removeFirstLetter(String userSource) {

		int index = 1;
		String newString = "";

		for (; index < userSource.length(); index++) {
			newString = newString + userSource.charAt(index);

		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(removeFirstLetter("hello"));
	}
}
