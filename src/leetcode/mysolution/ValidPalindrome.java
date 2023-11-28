package leetcode.mysolution;

/**
 * Runtime: 21 ms
 * Memory: 44.37 MB
 */

class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String replacedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder reverse = new StringBuilder();
        for (int i = replacedString.length() - 1; i >= 0; i--) {
            reverse.append(replacedString.charAt(i));
        }

        if (reverse.toString().equals(replacedString)) {
            return true;
        }
        return false;

    }
}