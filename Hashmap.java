import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Frequency Counter");
        System.out.println("----------------------");
        System.out.print("Enter a paragraph of text: ");
        String paragraph = scanner.nextLine();

        String[] words = paragraph.split("\\s+");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
        
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) { 
                int frequency = wordFrequency.getOrDefault(word, 0);
                wordFrequency.put(word, frequency + 1);
            }
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(word + ": " + frequency);
        }

        scanner.close();
    }
}
