public class PickOutEvery4Letters {
	public static String alternate(String userSource) {
		int index = 0;
		String newString = "";

		for (; index < userSource.length(); index += 4) {
			newString = newString + userSource.charAt(index);
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.print(alternate("wordhappytrigger"));
	}
}
