public class StringContains {

	public static boolean stringContains(String str, char ch) {

		int index = 0;
		String newString = "";

		for (; index < str.length(); index++) {
			char letter = str.charAt(index);

			if (letter == ch) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(stringContains("", 'a')); // should print false
		System.out.println(stringContains("abc", 'a')); // should print true
		System.out.println(stringContains("abc", 'd')); // should print false
		System.out.println(stringContains("philby", 'p')); // should print true
	}
}