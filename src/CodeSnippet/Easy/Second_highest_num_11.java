package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_highest_num_11 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,3,1,3,4,5,6);
        Integer i = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
    }
}
