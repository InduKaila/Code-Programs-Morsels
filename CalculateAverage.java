public class CalculateAverage {
	public static double mean(double[] a) {
		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		double[] values = new double[] { 4, 4, 10, 20, 2 };
		System.out.println(mean(values));
	}
}