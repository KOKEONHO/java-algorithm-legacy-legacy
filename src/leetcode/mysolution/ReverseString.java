package leetcode.mysolution;

/**
 * Runtime: 1 ms
 * Memory: 51.21 MB
 */

class ReverseString {
	public void reverseString(char[] s) {

		char temp;
		int length = s.length;

		for (int i = 0; i < length / 2; i++) {
			temp = s[i];
			s[i] = s[(length - 1) - i];
			s[(length - 1) - i] = temp;
		}

	}
}