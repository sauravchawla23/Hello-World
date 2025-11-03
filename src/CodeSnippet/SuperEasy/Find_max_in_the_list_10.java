package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_max_in_the_list_10 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,3,4,22,43,12);

        // first way by using sorting
        Optional<Integer> first = l.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(first.get());

        //by using reduce
        Integer reduce = l.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(reduce)
        ;
    }
}
