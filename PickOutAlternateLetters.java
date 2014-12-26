/*
 A method that picks out alternate letters, starting from the first - so oskar -> okr
 */

public class PickOutAlternateLetters {
	public static String alternator(String userSource) {
		int index = 0;
		String newString = "";

		for (; index < userSource.length(); index += 2) {
			newString = newString + userSource.charAt(index);
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(alternator("wordingtotry"));
	}
}
