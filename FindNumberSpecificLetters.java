public class FindNumberSpecificLetters {
	/**
	 * @param args
	 */
	private static int letterFinder(String word, char targetLetter) {

		int count = 0;

		for (int index = 0; index < word.length(); index++) {
			char currentLetter = word.charAt(index);
			
			if (currentLetter == targetLetter)
				count++;
		}
		return count;
	}

	private static void testingPad(String wd, char tl, int expected) {
		int answer = letterFinder(wd, tl);
		if (answer == expected)
			System.out.println("Hello, well done, the answer is " + expected
					+ " as expected");
		else
			System.out
					.println("Oh dear, it's wrong as you were expecting the answer: "
							+ expected + " but got the answer: " + answer);
	}

	public static void main(String[] args) {
		testingPad("", 'p', 0);
		testingPad("bacon", 'c', 1);
		testingPad("eggs", 'g', 2);
		testingPad("coffee", 'e', 2);
	}
}
