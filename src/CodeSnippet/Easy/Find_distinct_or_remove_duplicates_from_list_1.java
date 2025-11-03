package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_distinct_or_remove_duplicates_from_list_1 {
    public static void main(String[] args) {
//        input - 5,4,3,2,2,3,1
//        output - 5,4,3,2,1
        //using distinct method
        List<Integer> l = Arrays.asList(5,4,3,2,2,3,1);
        l.stream().distinct().forEach(System.out::println);

        //store iun new list
        List<Integer> list = l.stream().distinct().toList();
        System.out.println(list);
        //use set because set stores duplicate elements
        //but it will give u output in different order
        //it will not maintain the insertion order
        Set<Integer> collect = l.stream().collect(Collectors.toSet());
        System.out.println(collect);

    }
}
