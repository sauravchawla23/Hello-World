package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sort_list_in_aesc_3 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5,4,3,2,2,3,1);
        l.stream().sorted().forEach(System.out::println);

        List<Integer> list = l.stream().sorted().toList();
        System.out.println(list);
    }

}
