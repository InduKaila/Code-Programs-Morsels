public class FoodMenuExtractWithOrCondition {
	private static boolean showNextItem(String current) {
		if (!current.startsWith("boiled"))
			return true;
		return current.endsWith("suey");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] menuExtract = { "Beef in yellow bean sauce",
				"King prawns in chilli, peppercorn & salt",
				"Sweet & sour chicken balls", "Seaweed", "Pancake roll",
				"Vegetable chow mein", "Beef chow mein", "egg fried rice",
				"boiled rice", "boiled dumplings", "Spring roll", "Chop suey",
				"King prawns in satay sauce" };
		boolean showNext = true;
		for (int count = 0; showNext; count++) {
			System.out.println(menuExtract[count]);
			// showNext = !(menuExtract[count].endsWith("salt"));
			// showNext = !(menuExtract[count].startsWith("boiled") ||
			// menuExtract[count].endsWith("suey"));
			showNext = showNextItem(menuExtract[count]);
		}
	}
}
