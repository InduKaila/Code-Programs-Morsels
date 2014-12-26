public class MultiDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String title = "Mr";
		String[][] names = { { title, "Mrs", "Ms" },
				{ "Smith", "Jones", "Barley" },
				{ "Egg", "Trufton", "Philbert", "Miloshkin" },
				{ "Chichester", "Harriet" } };
		System.out.println(title + " " + names[1][2]);
		System.out.println(names[0][2] + " " + names[1][1]);
		System.out.println(names[0][0] + " " + names[2][3]);
		System.out.println(names[0][1] + " " + names[3][1]);
		System.out.println(names[2][0] + " " + names[3][0]);
	}
}
