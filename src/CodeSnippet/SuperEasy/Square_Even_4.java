package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Square_Even_4 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        l.stream().filter(i->i%2==0).map(i->i*i).forEach(System.out::println);
    }
}
