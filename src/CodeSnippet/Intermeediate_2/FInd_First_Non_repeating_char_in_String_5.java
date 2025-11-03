package CodeSnippet.Intermeediate_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FInd_First_Non_repeating_char_in_String_5 {
    public static void main(String[] args) {
        //first non repeating char is w so we need output w
        String s = "swiss";

        Map<Character, Long> collect = s.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().orElseThrow();
        System.out.println(characterLongEntry);
    }
}
