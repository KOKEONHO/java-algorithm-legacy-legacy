package leetcode.mysolution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Runtime: 18 ms
 * Memory: 43.47 MB
 */

class MostCommonWord {

	public static final String WHITE_SPACE = " ";

	public String mostCommonWord(String paragraph, String[] banned) {

		paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", WHITE_SPACE);

		String[] splittedParagraph = paragraph.split(WHITE_SPACE);

		List<String> bannedList = Arrays.stream(banned)
			.collect(Collectors.toList());

		Map<String, Integer> countWords = new HashMap<>();
		for (String word : splittedParagraph) {
			if (bannedList.contains(word) || word.isBlank()) {
				continue;
			}
			countWords.put(word, countWords.getOrDefault(word, 0) + 1);
		}

		Map.Entry<String, Integer> maxEntry = countWords.entrySet().stream()
			.max(Comparator.comparing(Map.Entry::getValue))
			.orElse(null);

		return maxEntry.getKey();
	}
}