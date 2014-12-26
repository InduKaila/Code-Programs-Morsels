import java.util.Arrays;

public class ArrayCopyLetters {

	public static void main(String[] args) {
		char[] copyFrom = { ' ', 'a', 'p', 'p', 'l', 'e', ' ', 'p', 'i', 'e' };
		char[] copyTo = { 'm', 'i', 'l', 'o', ' ', 'p', 'o', 'o', 'f', 'a',
				'c', 'e' };
		// char[] copyTo = new char[10];

		System.arraycopy(copyFrom, 2, copyTo, 3, 5);
		System.out.println(new String(copyTo));
	}
}
