public class UsualArraySyntaxNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] anArray = new int[10]; // create an array of integers

		anArray[0] = 100; // initialise first element
		anArray[1] = 200;
		anArray[3] = 300;
		anArray[4] = 400;
		anArray[5] = 500;
		anArray[6] = 600;
		anArray[7] = 700;
		anArray[8] = 800;
		anArray[9] = 900;

		System.out.println("Element 3 at index 3: " + anArray[3]);
		System.out.println("Element 4 at index 4: " + anArray[4]);
		System.out.println("Element 7 at index 7: " + anArray[7]);
	}
}
