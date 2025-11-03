package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Sum_of_square_even_11 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        Integer reduce = l.stream().filter(i -> i % 2 == 0).map(i -> i * i).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
