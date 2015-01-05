public class StringLengthComparison {
	/**
	 * @param args
	 */
	private static String comparer(String userSource1, String userSource2) {

		String result = "";

		if (userSource1.length() == userSource2.length()) {
			System.out.println("Yes, the length of the two words matches.");
		} else {
			System.out
					.println("Oh dear, no match between the length of the two words.");

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(comparer("", ""));
		System.out.println(comparer("", "a"));
		System.out.println(comparer("cinnamon", "sugar"));
		System.out.println(comparer("apple", "crumble"));
		System.out.println(comparer("eggs", "benedict"));
		System.out.println(comparer("plum", "tart"));
		System.out.println(comparer("chocolate", "eclair"));
	}
}
