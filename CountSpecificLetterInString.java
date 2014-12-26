/*
A program that creates a string and counts the number of times the letter 'b' appears in it 
(e.g. Philby has 1 b whereas Oskar has 0). For bonus marks:
 - make it case insensitive (i.e. will count 'b' or 'B')
 - convert this to a separate method that can be called (i.e. pass string as a parameter and return the 
 count)
 - add a second parameter to the method being the letter you want to count (so we can count something 
 other than b)
 */

public class CountSpecificLetterInString {
	public static int letterCounter(String stringFromUser, char targetLetter) {
		int index = 0;
		int counter = 0;

		while (index < stringFromUser.length()) {
			char currentLetter = stringFromUser.charAt(index);
			if (currentLetter == targetLetter) {
				counter++;
			}
			index++;
		}
		if (counter == 0) {
			return -1;
		} else {
			return counter;
		}
	}

	public static void main(String[] args) {
		System.out.print(letterCounter("christine", 'z'));
	}
}
