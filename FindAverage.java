public class FindAverage {
	/**
	 * @param args
	 */
	public static double mean(double[] v) {
		double sum = 0.0;
		for (int i = 0; i < v.length; i++) {
			sum = sum + v[i];
		}
		return sum / v.length;
	}

	public static void main(String[] args) {
		double[] values = new double[] { 20, 5, 3, 6 };
		System.out.println(mean(values));
	}
}
