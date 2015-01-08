public class ForLoopStringLengthComparisonWithTest {
	/**
	 * @param args
	 */
	private static int getShorterLength(String us1, String us2) {

		if (us1.length() < us2.length())
			return us1.length();

		return us2.length();
	}

	private static int getIndexOf1stMatchingLetter(String us1, String us2) {

		int shorterLength = getShorterLength(us1, us2);
		
		for (int index = 0; index < shorterLength ; index++) {
			char l1 = us1.charAt(index); 
			char l2 = us2.charAt(index);
			
			if (l1 == l2)
				return index;
		}
		return -1;
	}

	private static void test(String us1, String us2, int expectedIndex) {
		int observedIndex = getIndexOf1stMatchingLetter(us1, us2);
		if (observedIndex == expectedIndex)
			System.out.println("The Test has passed: the index of the first matching letter is " + expectedIndex);
		else
			System.out.println("FAIL! Expected " + expectedIndex + " but got " + observedIndex);
	}

	public static void main(String[] args) {
		test("a", "a", 0);
		test("ac", "bc", 1);
		test("wombleton", "vandertext", 6);
		test("Sherbert", "lemons", -1);
	}
}
