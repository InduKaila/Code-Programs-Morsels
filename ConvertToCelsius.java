// Convert Farenheit to Celsius
// [°C] = ([°F] - 32) × 5/9

public class ConvertToCelsius {
	public static double wantCelsius(int userSource) {

		double answer = (userSource - 32) * (5.0 / 9.0);
		return answer;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(wantCelsius(45));
	}
}
