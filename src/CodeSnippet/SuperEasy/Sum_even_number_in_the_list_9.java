package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Sum_even_number_in_the_list_9 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer reduce = l.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
