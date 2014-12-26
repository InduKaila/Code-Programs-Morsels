public class GenerateDishes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] meals = new String[] { "Chicken tagine",
				"Anchovies with preserved lemons", "Stuffed vine leaves",
				"Arabic coffee",
				"Meatball tagine with preserved lemons and olives", "Harissa",
				"Spicy chickpeas with pomegranate", "Spicy lamb koftas",
				"Chicken tagine with apricots", "Couscous salad", "Salad" };
		boolean showNext = true;
		for (int ct = 0; showNext; ct++) {
			String meal = meals[ct];
			System.out.println(meal);
			// showNext = !meal.contains("Salad");
			showNext = ct < meals.length - 1;
		}
	}
}
