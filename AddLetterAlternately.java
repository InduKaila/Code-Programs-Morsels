public class AddLetterAlternately {
	/**
	 * @param args
	 */
	private static String addLetter(String userSource, char targetLetterToAdd) {

		String result = "";

		for (int index = 0; index < userSource.length(); index++) {
			char thisLetter = userSource.charAt(index);

			if (thisLetter != targetLetterToAdd)
				result = result + userSource.charAt(index) + targetLetterToAdd;

		}
		return result;
	}

	private static void test(String us, char tl, String expected) {
		String result = addLetter(us, tl);
		if (result.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test has failed. Expected: <" + expected
					+ "> but got <" + result + ">");
	}

	// Created a test
	public static void main(String[] args) {
		test("", 'z', "");
		test("eg", 'z', "ezgz");
		// case sensitive!
		test("Milo", 'm', "Mmimlmom");
		test("Eggs", 'z', "Ezgzgzsz");
		test("Benedict", '*', "B*e*n*e*d*i*c*t*");
	}
}
