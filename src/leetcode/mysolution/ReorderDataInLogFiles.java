package leetcode.mysolution;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime: 5 ms
 * Memory: 43.68 MB
 */

public class ReorderDataInLogFiles {

	public static final String WHITE_SPACE = " ";

	public String[] reorderLogFiles(String[] logs) {

		List<String> digitList = new ArrayList<>();
		List<String> letterList = new ArrayList<>();

		// 문자 로그와 숫자 로그 분리
		for (String log : logs) {
			if (Character.isDigit(log.split(WHITE_SPACE, 2)[1].charAt(0))) {
				digitList.add(log);
				continue;
			}
			letterList.add(log);
		}

		// 문자 로그 사전 순으로 정렬
		letterList.sort((log1, log2) -> {
			String[] splittedLog1 = log1.split(WHITE_SPACE, 2);
			String[] splittedLog2 = log2.split(WHITE_SPACE, 2);

			int comparison = splittedLog1[1].compareTo(splittedLog2[1]);

			if (comparison == 0) {
				return splittedLog1[0].compareTo(splittedLog2[0]);
			} else {
				return comparison;
			}
		});

		// 문자 로그 뒤로 숫자 로그 병합
		letterList.addAll(digitList);

		return letterList.toArray(new String[0]);
	}
}
