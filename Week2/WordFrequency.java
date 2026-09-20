/*
@author Vedh
*/

import java.util.*;
class WordFrequency{
    void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");
        String[] words = feedback.split("\\s+");
        String[] stopWords = {
            "the", "was", "and", "a", "is", "of", "in"
        };
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            boolean isStopWord = false;
            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }
            if (!isStopWord) {

                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> list =
            new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : list)
            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
    }
    public static void main(String[] args) {
        WordFrequency obj = new WordFrequency();
        obj.printFilteredWordFrequency(
            "The mentor was great, the session was great and clear."
        );
    }
}