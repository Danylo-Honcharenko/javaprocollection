import java.util.*;

public class ArrayCollection {
    public static void countOccurance(List<String> list, String word) {
        int counter = 0;
        for (String words : list) {
            if (words.equals(word)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("The word is not repeated!");
            return;
        }
        System.out.println("The word is repeated: " + counter);
    }

    public static List<Integer> toList(Integer[] number) {
        return Arrays.asList(number);
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int numbers : list) {
            if (!uniqueList.contains(numbers)) {
                uniqueList.add(numbers);
            }
        }
        return uniqueList;
    }

    public static List<WordOccurrence> calcOccurance(List<String> words) {
        HashMap<String, Integer> wordStorage = new HashMap<>();
        for (String wordIntegration : words) {
            if (wordStorage.containsKey(wordIntegration)) {
                int counter = wordStorage.get(wordIntegration);
                wordStorage.put(wordIntegration, counter + 1);
            } else {
                wordStorage.put(wordIntegration, 1);
            }
        }

        List<WordOccurrence> wordOccurrenceList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordStorage.entrySet()) {
            wordOccurrenceList.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return wordOccurrenceList;
    }
}
