/*For the "simple" no-duplicates method, you could split it into two methods.

So the test cases first:

  System.out.println(removeDuplicates("")); // prints blank line
  System.out.println(removeDuplicates("abcde")); // prints abcde
  System.out.println(removeDuplicates("aba")); // prints ab
  System.out.println(removeDuplicates("aaaaa")); // prints a

The algorithm does the usual thing of looping over the source string, 
taking each letter at a time and adding it to the newString BUT... we only 
add the letter if it is not already in the newString. 

This creates a sub-problem: how do we know if a string contains a letter? 
Need to implement this:

public static boolean stringContains(String string, char letter) {
  // code here
}

Call stringContains with the newString and each letter, and only 
add the letter if the method returns false. 
 */

public class NoDuplicateLetters {

	public static String isDuplicateLetterRemoveIt(String userSource, char ch) {

		boolean contains = StringContains.stringContains(userSource, ch);

		// only adds if doesn't already contain that letter
		int index = 0;
		String newString = "";

		for (; index < userSource.length(); index++) {
			char letter = userSource.charAt(index);

			if (letter != ch) {
				return newString = newString + ch;
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(isDuplicateLetterRemoveIt("", 'a')); // prints blank
																// line
		System.out.println(isDuplicateLetterRemoveIt("abcde", 'b')); // prints
																		// abcde
		System.out.println(isDuplicateLetterRemoveIt("aba", 'c')); // prints ab
		System.out.println(isDuplicateLetterRemoveIt("aaaaa", 'b')); // prints a
	}
}
