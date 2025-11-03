package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_even_2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //toList
        List<Integer> list = l.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list);

        //collect(Collectors.toList)
        List<Integer> collect = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //forEach
        l.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
