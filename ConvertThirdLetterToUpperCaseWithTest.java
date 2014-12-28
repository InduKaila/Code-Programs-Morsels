public class ConvertThirdLetterToUpperCaseWithTest {
	/**
	 * @param args
	 */
	private static String converter(String userSource) {

		String newString = "";

		for (int index = 0; index < userSource.length(); index++) {
			char ch = userSource.charAt(index);

			if (index == 2) {
				ch = Character.toUpperCase(ch);
			}
			newString = newString + ch;

		}
		return newString;
	}

	private static void testingPad(String us, String expected) {
		String answer = converter(us);
		if (answer.equals(expected))
			System.out.println("You've given the correct answer, which is: "
							+ expected);
		else
			System.out.println("Incorrect, as you've given: " + answer
					+ " when infact the expected answer is " + expected);
	}

	public static void main(String[] args) {
		testingPad("", "");
		testingPad("sausage", "saUsage");
		testingPad("eggs", "egGs");
	}
}
