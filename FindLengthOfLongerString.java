public class FindLengthOfLongerString {

	public static int stringLength(String userSource1, String userSource2) {

		int userSource1StringLength = userSource1.length();
		int userSource2StringLength = userSource2.length();

		if (userSource1StringLength > userSource2StringLength) {
			return userSource1StringLength;

		}
		return userSource2StringLength;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(stringLength("hello", "fantastic"));
	}
}
