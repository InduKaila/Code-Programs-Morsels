public class PrimeNumbers {
	public static boolean isItAPrimeNumber(int num) {

		for (int i = 2; i < num; i++) {// num = 5, 2 < 5
			if (num % i == 0) { // i = 3, 3 < 5
				return false; // i = 4
			}

		}
		return true;
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(isItAPrimeNumber(3));
		System.out.println(isItAPrimeNumber(4));
		System.out.println(isItAPrimeNumber(5));
		System.out.println(isItAPrimeNumber(6));
		System.out.println(isItAPrimeNumber(7));
		System.out.println(isItAPrimeNumber(8));
		System.out.println(isItAPrimeNumber(9));
		System.out.println(isItAPrimeNumber(10));
	}
}
/*
 * public class CalculateAverage { public static double mean(double[] a) {
 * double sum = 0.0; for (int i = 0; i < a.length; i++) { sum = sum + a[i];
 * 
 * } return sum / a.length; }
 * 
 * 
 * public static void main(String[] args){ double[] values = new double[] {4, 4,
 * 10, 20, 2}; System.out.println(mean(values)); } }
 */