package cl.juan.playground.amazon.search.suggestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchSuggestion {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

        List<List<String>> returnValue = new ArrayList<>();

        if (repository == null || repository.isEmpty() || customerQuery == null || customerQuery.length() < 2) {
            return returnValue;

        }

        List<String> sortedRepository = new ArrayList<>();
        for (String word : repository) {
            sortedRepository.add(word.toLowerCase());
        }

        Collections.sort(sortedRepository);

        for (int i = 2; i <= customerQuery.length(); i++) {
            String tempQuery = customerQuery.substring(0, i).toLowerCase();
            List<String> singlePassResult = new ArrayList<>();
            singlePassResult.add(tempQuery);
            for (String word : sortedRepository) {
                if (word.startsWith(tempQuery) && singlePassResult.size() < 4) {
                    singlePassResult.add(word);
                }
            }
            returnValue.add(singlePassResult);
        }
        return returnValue;
    }
}
