/*
public class FindMode {
	/**
 * @param args
 */
//need to count 
//iterate through the array counting the number of times we see the current number
//if they match increment the current count
// We only save this candidate mode, if its count is greater than the current mode
// we have stored in the "mode" variable
//if (currCount > modeCount)
//{
//modeCount = currCount;
//mode = candidateMode;
//}

/*	public static double mode(double[] count) {
 int index = 0;
 double answer = 0.0;
 double currentNumber = 0.0;
 for (; index < count.length; index++) {
 answer = count >= currentNumber; 
 if (){

 } else {

 }
 }
 return answer;
 }


 public static void main(String[] args) {
 double[] values = new double[] { 5, 5, 5, 8, 34, 9 };
 System.out.println(mode(values));
 }
 }*/

public class FindOccurrence {
	public static void main(String[] args) {
		int[] hand = { 2, 4, 3, 2, 4 };
		int[] numOccurence = new int[hand.length];

		for (int i = 0; i < hand.length; i++) {
			numOccurence[hand[i]]++;
		}
		for (int i = 1; i < numOccurence.length; i++) {
			if (numOccurence[i] > 0)
				System.out.println("The number " + i + " occurs "
						+ numOccurence[i] + " times.");
		}
	}
}
