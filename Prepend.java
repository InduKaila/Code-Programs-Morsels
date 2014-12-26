/*	
Write a method that prepends the word "food" to a string and returns the 
value. So if you give it "food", it will return "foodChi".
 */

public class Prepend {
	public static String prepender(String userSource) {

		String toAdd = "food" + userSource;
		return toAdd;

	}

	public static void main(String[] args) {

		System.out.println(prepender("Chi"));
	}
}
