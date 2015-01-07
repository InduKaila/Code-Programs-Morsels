public class Interleave2StringsUnequalLengthWithTest {
	/**
	 * @param args
	 */
	public static String interleaver(String userSource1, String userSource2) {
		String result = "";
		int index = 0;

		if (userSource1.length() < userSource2.length()) {

			for (; index < userSource1.length(); index++) {

				result = result + userSource1.charAt(index);
				result = result + userSource2.charAt(index);
			}

			for (; index < userSource2.length(); index++) {
				result = result + userSource2.charAt(index);
			}

		}

		else {
			for (; index < userSource2.length(); index++) {

				result = result + userSource1.charAt(index);
				result = result + userSource2.charAt(index);
			}

			for (; index < userSource1.length(); index++) {
				result = result + userSource1.charAt(index);
			}

		}
		return result;
	}


	private static void test(String us1, String us2, String expected) {
		String result = interleaver(us1, us2);
		if (result.equals(expected))
			System.out.println("Test has passed.");
		else
			System.out.println("Test failed. Expected: <" + expected + "> but got <" + result + ">");	
	}
	
	
		// Created a test
		// case sensitive!
		public static void main(String[] args) {
			test("", "a", "a");
			test("a", "b", "ab");
			test("a", "a", "aa");
			test("Cake", "ChocoLate", "CCahkoecoLate");
			test("Cheese", "Pickle", "CPhiecekslee");
			test("Milo", "m", "Mmilo");
			test("Eggs", "bacon", "Ebgagcson");
			test("f", "Truffle", "fTruffle");
			test("Banana", "too", "Btaonoana");
			test("Apple", "tart", "Atpaprlte");
		}	
}