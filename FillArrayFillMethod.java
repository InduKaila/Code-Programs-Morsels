import java.util.Arrays;

public class FillArrayFillMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numberArray = { 1, 3, 6, 7 };
		int number2Array = 4;

		Arrays.fill(numberArray, number2Array);
		for (int index = 0; index < numberArray.length; index++) {
			System.out.println(numberArray[index]);
		}
	}
}
