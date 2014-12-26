public class CountNumbers {

	public static void main(String[] args) {

		// declares an array of integers
		int[] arrayNum;

		// allocates memory for 10 integers
		arrayNum = new int[10];

		// placement of index, to start at 0
		for (int counter = 0; counter < arrayNum.length; counter++) {
			System.out.println(counter + ":" + arrayNum[counter]);
		}
	}
}