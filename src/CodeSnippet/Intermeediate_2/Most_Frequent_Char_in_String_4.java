package CodeSnippet.Intermeediate_2;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Most_Frequent_Char_in_String_4 {
    public static void main(String[] args) {
        String input = "banana";

        // To convert a String into a Stream, use chars()
        // chars() returns an IntStream (Unicode values of characters)
        // mapToObj(i -> (char) i) converts int → char objects
        // Then we group each character and count how many times it occurs
        Map<Character, Long> collect = input.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //give maximum occured char in a string
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(characterLongEntry);
    }
}
