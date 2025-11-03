package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Mul_all_num_8 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
       // The reduce() method in Java Stream API is used to combine all elements of
       // a stream into a single result (like sum, product, max, min, etc).
       // 0 → starting value (identity)
       //(a, b) -> a + b → how to combine elements (lambda)
        Integer reduce = l.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
