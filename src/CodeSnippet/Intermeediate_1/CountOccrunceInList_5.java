package CodeSnippet.Intermeediate_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccrunceInList_5 {
    public static void main(String[] args) {
        //apple - 3
        //mango - 1
        //banana- 2

//        You are grouping each fruit name and counting how many times it occurs in the list.
//        Function.identity() means → “use the same fruit name as the key which is in the list.”
//        Collectors.counting() means → “count how many times each fruit appears.”
        //so here key are fruits and there count is value
        List<String> list = Arrays.asList("apple", "banana", "apple", "mango", "banana","apple");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
