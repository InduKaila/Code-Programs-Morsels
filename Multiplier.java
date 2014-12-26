public class Multiplier {
	/*
	 * Write a method that accepts two integers and returns the value obtained
	 * by multiplying them together. So if I pass in 3 and 2, I should expect 6
	 * back.
	 */
	/**
	 * @param args
	 */

	public static int multiply(int userSource1, int userSource2) {

		int answer = userSource1 * userSource2;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(multiply(2, 4));
	}
}
