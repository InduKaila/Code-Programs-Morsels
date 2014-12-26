// Convert to Farenheit
// [°F] = [°C] × 9/5 + 32

public class ConvertToFarenheit {
	public static double wantFarenheit(int userSource) {

		double answer = userSource * (9.0 / 5.0) + 32;
		return answer;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(wantFarenheit(100));
	}
}
