package Coding_Interview_Questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class first_non_repeating_char {
    public static void main(String[] args) {
        String s = "ssaumurravvb";
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
//
//        Map.Entry<Character, Integer> entry means one key-value pair from the map.
//
//        Map.Entry → a special interface that represents a single pair inside a map.
//
//        Character → the key type (in your map, the character).
//
//        Integer → the value type (in your map, the count).
//
//        entry → the variable holding one pair during each loop iteration.

//        map.entrySet() → gives all entries (key and value) from the map.
//        entry.getKey() → gives the key (here, the character).
//        entry.getValue() → gives the value (here, how many times that character appeared).



        // Step 2: Find first character with frequency 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");

    }
}
