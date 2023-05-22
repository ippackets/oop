import java.util.HashMap;
import java.util.Map;

public class _2_duplicate_words_in_string {
    
    public static void countDuplicateWords(String str) {
        // Create a HashMap to store word-frequency pairs
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        // Split the string into individual words
        String[] words = str.toLowerCase().split("\\s+");
        
        // Iterate over each word
        for (String word : words) {
            // Check if the word exists in the HashMap
            if (wordFrequency.containsKey(word)) {
                // If the word is already present, increment its frequency by 1
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the HashMap with a frequency of 1
                wordFrequency.put(word, 1);
            }
        }
        
        // Display the duplicate words and their frequencies
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        String sentence = "This is a sentence. This is another sentence.";
        countDuplicateWords(sentence);
    }
}

