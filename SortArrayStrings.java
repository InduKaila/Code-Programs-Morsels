import java.util.Arrays;

public class SortArrayStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arrayString = { "cinnamon", "buns", "spaghetti", "pearls",
				"juniper berries" };

		Arrays.sort(arrayString);
		for (int index = 0; index < arrayString.length; index++) {
			System.out.println(arrayString[index]);
		}
	}
}
