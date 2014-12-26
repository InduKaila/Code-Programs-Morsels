public class FindMax {

	/**
	 * @param args
	 */

	public static int maxValue(int[] userSource) {
		int max = 0;

		for (int index = 0; index < userSource.length; index++) {
			if (max < userSource[index]) {
				max = userSource[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] values = { 2, 4, 3, 2, 6 };
		System.out.println(maxValue(values));
	}
}
