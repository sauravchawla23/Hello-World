package Coding_Interview_Questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class first_non_repeating_char {
    public static void main(String[] args) {
        String s = "sauurravvb";
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

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
