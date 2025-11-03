package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;

public class number_div_3_8 {
    public static void main(String[] args) {
        //check if any number is div by 3 in a list
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //The anyMatch() method in Stream API checks whether at least one element
        // in the stream matches the given condition.
        boolean b = l.stream().anyMatch(i -> i % 3 == 0);
        System.out.println(b);
    }
}
