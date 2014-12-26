public class CountJump {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] meals = new String[] { "pasta", "pizza", "fish and chips",
				"methappen", "peshwari gosht", "steak (raw)",
				"fried egg sandwich" };
		int start = 2;
		int nextStart = 1;
		int stepBy = 2;
		for (int ct = start; ct < meals.length; ct += stepBy) {
			System.out.println(meals[ct]);
			if (ct == 6)
				ct = nextStart;
		}
	}
}
// ct=2, 2<7
// fish and chips

// ct 2 + 2 = 4 (does ct +=stepBy)
// 4<7 (does ct<meals.length)
// peshwari gosht

// ct 4 + 2 = 6
// 6<7
// fried egg sandwich

// ct is ==6 so
// ct = 1
// ct + 2 = 3
// 3<7
// methappen

// ct 3 + 2 = 5
// 5<7
// steak (raw)

// ct 5 + 2 = 7
// 7 not < 7 so for loop stops

