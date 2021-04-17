package cl.juan.playground.amazon.search.suggestion;

import cl.juan.playground.amazon.path.count.UniquePathWithObstacles;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class SearchSuggestionTest {

    List<String> repository = Arrays.asList(
            "mobile", "mouse", "moneypot", "monitor", "mousepad");
    String customerQuery = "mouse";



    @Test
    @DisplayName("Path Validation")
    void shouldBeEqualTabulation() {
        List<List<String>> searchSuggestions = SearchSuggestion.searchSuggestions(repository, customerQuery);
        for (List<String> suggestionList: searchSuggestions) { //this equals to the row in our matrix.
            for (String suggestion: suggestionList) { //this equals to the column in each row.
                System.out.print(suggestion + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }

    }

}