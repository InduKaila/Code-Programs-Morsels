import java.util.Arrays;

public class FindIndexOfCharValue {

	public static void main(String[] args) {
		char[] letterArray = { ' ', 'a', 'p', 'p', 'l', 'e', ' ', 'p', 'i', 'e' };

		System.out.print(Arrays.binarySearch(letterArray, 'l'));
	}
}