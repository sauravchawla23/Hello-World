package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sum_all_num_7 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        Integer sum = l.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
