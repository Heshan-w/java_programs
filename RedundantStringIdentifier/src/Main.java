import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("apple");

        printRepeatedStrings(stringList);
    }

    public static void printRepeatedStrings(ArrayList<String> stringList) {
        // Create a map to store the frequency of each string
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each string in the list
        for (String str : stringList) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Print only the repeated strings and their frequencies
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
}
