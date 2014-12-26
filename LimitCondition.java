public class LimitCondition {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] meals = new String[] { "pasta", "pizza", "fish and chips",
				"methappen", "peshwari gosht", "steak (raw)",
				"fried egg sandwich" };
		boolean showNext = true;
		for (int ct = 0; showNext; ct++) {
			System.out.println(meals[ct]);
			showNext = !(meals[ct].startsWith("pesh"));
		}
	}
}
// ct=0, true,
// pasta

// ct 0 + 1 = 1
// ct 1 true doesn't start with pesh
// pizza

// ct 1 + 1 = 2
// ct 2 true doesn't start with pesh
// fish and chips

// ct 2 + 1 = 3
// ct true doesnt start with methpappen
// methappen

// ct 3 + 1 = 4
// peshwari gosht
// ct false does start with pesh so for loop stops

