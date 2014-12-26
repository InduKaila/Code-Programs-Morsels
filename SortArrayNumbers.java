import java.util.Arrays;

public class SortArrayNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayNumber = { 43, 24, 67, 1 };

		Arrays.sort(arrayNumber);
		for (int index = 0; index < arrayNumber.length; index++) {
			System.out.println(arrayNumber[index]);
		}
	}
}
