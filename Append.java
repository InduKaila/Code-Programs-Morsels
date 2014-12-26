public class Append {
	public static String append1stStringTo2ndString(String userSource1,
			String userSource2) {

		int index = 0;
		String newString = "";

		for (; index < userSource1.length(); index++) {
			newString = userSource1 + userSource2;
		}

		return newString;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(append1stStringTo2ndString("hello", "idea"));
	}
}
