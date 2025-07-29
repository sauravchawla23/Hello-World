package Streams_interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class find_occurence_of_char_in_string {
    public static void main(String[] args) {
        String s = "aaaabbcddddd";
        Map<Character, Long> charCount = s.chars() // IntStream of characters
                .mapToObj(c -> (char) c)              // Convert int to Character
                .collect(Collectors.groupingBy(       // Group by character
                        Function.identity(),              // Key = character itself
                        Collectors.counting()));          // Count occurrences

        // Print result
        charCount.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
