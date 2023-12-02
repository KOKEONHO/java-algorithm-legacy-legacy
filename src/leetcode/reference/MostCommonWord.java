package leetcode.reference;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

	public static final String WHITE_SPACE = " ";

	public String mostCommonWord(String p, String[] banned) {

		// 금지어 목록이 String 배열이므로, 비교 메서드를 제공하는 Set으로 변환
		Set<String> bannedSet = new HashSet<>();

		// 각 단어별 개수가 저장될 키-값 Map
		Map<String, Integer> counts = new HashMap<>();

		// 전처리 작업 후 단어 목록을 배열로 저장
		String[] splittedP = p.toLowerCase().replaceAll("\\W+", WHITE_SPACE).split(WHITE_SPACE);

		for (String word : splittedP) {
			// 금지된 단어가 아닌 경우 개수 처리
			if (!bannedSet.contains(word)) {
				counts.put(word, counts.getOrDefault(word, 0) + 1);
			}
		}

		// 가장 흔하게 등장하는 단어 추출
		return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
}
