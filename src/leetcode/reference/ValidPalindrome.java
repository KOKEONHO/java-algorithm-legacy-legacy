package leetcode.reference;

import java.io.*;

public class ValidPalindrome {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(isPalindrome(br.readLine()));
    }

    public static boolean isPalindrome(String s) {

        // 정규식으로 유효한 문자만 추출한 뒤 모두 소문자로 변경
        String filteredString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 문자열을 뒤집은 뒤 `String`으로 변경
        String reversedString = new StringBuilder(filteredString).reverse().toString();

        // 두 문자열 비교
        return filteredString.equals(reversedString);

    }
}
