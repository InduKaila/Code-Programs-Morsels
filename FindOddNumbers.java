public class FindOddNumbers {
	public static boolean isItOdd(int num) {

		for (int i = 0; i < num; i++) {
			if (num % 3 == 0)
				return true;
		}
		return false;
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(isItOdd(0));
		System.out.println(isItOdd(9));
		System.out.println(isItOdd(15));
		System.out.println(isItOdd(8));
		System.out.println(isItOdd(2));
		System.out.println(isItOdd(1));
	}
}
