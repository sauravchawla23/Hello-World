package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;

public class flatten_list_of_list_9 {
    public static void main(String[] args) {

        //here we have three list inside a list and we need to make into a single list
        List<List<Integer>> l = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        List<Integer> list = l.stream().flatMap(i -> i.stream()).toList();
        System.out.println(list);
    }
}
