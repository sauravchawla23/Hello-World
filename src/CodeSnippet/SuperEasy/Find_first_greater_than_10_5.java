package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_first_greater_than_10_5 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,15,7,12,13);
        System.out.println(l.stream().filter(i -> i > 10).findFirst().get());

        //another way
        Optional<Integer> first = l.stream().filter(i -> i > 10).findFirst();
        System.out.println(first.get());

        //if 15,12,13 are there we want 12 because we want in sorting so
        System.out.println(l.stream().filter(i -> i > 10).sorted().findFirst().get());
    }
}
