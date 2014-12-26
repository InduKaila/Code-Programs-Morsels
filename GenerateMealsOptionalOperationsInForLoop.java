public class GenerateMealsOptionalOperationsInForLoop {

	public static void main(String[] args) {
		// String[] meals = new String[] { "pasta", "pizza", "fish and chips",
		// "methappen", "peshwari gosht", "steak (raw)",
		// "fried egg sandwich" };
		String[] meals = new String[] { "steak (raw)" };
		int ct = 0;
		boolean keepGoing = true;
		for (; keepGoing;) {
			String meal = meals[ct];
			System.out.println(meal);

			ct += 2;
			if (ct >= meals.length)
				ct -= meals.length;
			keepGoing = !meal.contains("raw");
		}
	}
}
// This one shows that each of the three operations in a for loop is optional.
// In this case both the intialisation and the increment steps are handled
// elsewhere
// (note though that they *are* handled!)
// ct=0, keepGoing=true
// pasta
// ct=0+2=2
// keepGoing true
// fish and chips
// ct=2+2=4
// keepGoing true
// true
// peshwari gosht
// ct=4+2=6
// keepGoing true
// true
// fried egg sandwich
// ct=6+2=8
// if 8 as >=meals.length
// ct=8-7=1
// true
// pizza
// ct=1+2=3
// methappen
// ct=3+2=5
// ct=5
// keepGoing false so the for loop ends

