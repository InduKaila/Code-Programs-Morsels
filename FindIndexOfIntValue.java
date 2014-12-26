import java.util.Arrays;

public class FindIndexOfIntValue {

	public static void main(String[] args) {
		int[] numberArray = { 3, 6, 2, 9, 10, 12, 14 };

		System.out.println(Arrays.binarySearch(numberArray, 14));
	}
}
