import java.util.Arrays;

public class ForLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] foodArray = { "custart tart", // 0
				"custard creme", // 1
				"creme brulee", // 2
				"cinnamon bun", // 3
				"cinnamon sugar", // 4
				"lavender sugar", // 5
				"kale", // 6
				"sweetcorn", // 7
				"cinnamon", // 8
				"honey", // 9
				"fig", // 10
				"lemon" }; // 11

		for (int index = 0; index < foodArray.length; index++) {
			System.out.println(foodArray[index]);
		}
	}
}
