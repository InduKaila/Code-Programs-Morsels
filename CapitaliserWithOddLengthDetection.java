public class CapitaliserWithOddLengthDetection {

	public static boolean isOddLength(String userSource) {
		int rem = userSource.length() % 2;

		if (rem == 1) {
			return true;
		}
		return false;
	}

	public static String capitaliser(String userSource) {
		int index = 0;
		String newString = "";
		int stringLength = userSource.length();
		int lengthHalved = stringLength / 2;

		if (isOddLength(userSource)) {
			lengthHalved++;
		}
		for (; index < stringLength; index++) {
			char ch = userSource.charAt(index);

			if (index < lengthHalved) {
				ch = Character.toUpperCase(ch);
			}

			newString = newString + ch;
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(capitaliser(""));
		System.out.println(capitaliser("philby"));
		System.out.println(capitaliser("hello"));
	}
}