public class RemoveStringLetters {

	public static String reverser(String userSource) {
		int index = userSource.length() - 1;
		String newString = "";

		for (; index >= 0; index -= 2) {
			newString = newString + userSource.charAt(index);

		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(reverser("philby"));
	}
}
