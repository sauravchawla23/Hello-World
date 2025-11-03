package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Square_Each_3 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        l.stream().map(i->i*i).forEach(System.out::println);
    }
}
