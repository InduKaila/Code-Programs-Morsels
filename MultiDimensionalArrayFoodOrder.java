public class MultiDimensionalArrayFoodOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[][] anArray = { { "Sandwich", "Salad", "Toastie", "Cake" },
				{ "Tea", "Coffee", "Juice" },
				{ "Cheese", "Ham", "Truffle", "Egg", "Roll" },
				{ "Mushroom and Cheese", "Oyster" },
				{ "Thermidor", "Omelette", "Orange" } };

		// gives 1.Cake and Tea
		System.out.println("1." + anArray[0][3] + " " + "and" + " "
				+ anArray[1][0]);
		// gives 2.Egg Salad
		System.out.println("2." + anArray[2][3] + " " + anArray[1][1]);
		// gives 3.Cheese Sandwich
		System.out.println("3." + anArray[2][0] + " " + anArray[0][0]);
		// gives 4.Mushroom and Cheese Omelette
		System.out.println("4." + anArray[3][0] + " " + anArray[4][1]);
		// gives 5.Ham Toastie
		System.out.println("5." + anArray[2][1] + " " + anArray[0][2]);
		// gives 6.Coffee Cake
		System.out.println("6." + anArray[1][1] + " " + anArray[0][3]);
		// gives 7.Ham Toastie
		System.out.println("7." + anArray[2][1] + " " + anArray[0][2]);
		// gives 8.Ham Omelette
		System.out.println("8." + anArray[2][1] + " " + anArray[4][1]);
		// gives 9.Orange Juice
		System.out.println("9." + anArray[4][2] + " " + anArray[1][2]);
		// gives 10.Mushroom and Cheese Roll
		System.out.println("10." + anArray[3][0] + " " + anArray[2][4]);
		// gives 11.Orange Salad
		System.out.println("11." + anArray[4][2] + " " + anArray[0][1]);
		// gives 12.Truffle Omelette
		System.out.println("12." + anArray[2][2] + " " + anArray[4][1]);
	}
}
