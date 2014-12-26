// Find highest value in an array
// static void method that accepts an array of ints

public class FindHighestValue {
	public static void printValues(int[] maxy) {

		for (int index = 0; index < maxy.length; index++) {
			System.out.println("Value at index " + index + ": " + maxy[index]);
		}
	}

	public static int maxValue(int[] values) {
		int max = 0;

		for (int index = 0; index < values.length; index++) {
			if (max < values[index]) {
				max = values[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] listNumbers;
		listNumbers = new int[5];
		listNumbers[0] = 100; // initialize first element
		listNumbers[1] = 200; // initialize second element
		listNumbers[2] = 3000;
		listNumbers[3] = 400;
		listNumbers[4] = 600;

		printValues(listNumbers);
		int max = maxValue(listNumbers);
		System.out.println("max is " + max);
		// System.out.println("length is " + listNumbers.length);
		// System.out.print("Value at index 3: " + listNumbers[3]);

	}
}

/*
 * anArray = new int[10];
 * 
 * If this statement is missing, then the compiler prints an error like the
 * following, and compilation fails:
 * 
 * ArrayDemo.java:4: Variable anArray may not have been initialized.
 * 
 * The next few lines assign values to each element of the array:
 * 
 * anArray[0] = 100; // initialize first element anArray[1] = 200; // initialize
 * second element anArray[2] = 300; // and so forth
 * 
 * Each array element is accessed by its numerical index:
 * 
 * System.out.println("Element 1 at index 0: " + anArray[0]);
 */