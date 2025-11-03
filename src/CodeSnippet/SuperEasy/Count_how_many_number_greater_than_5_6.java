package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;

public class Count_how_many_number_greater_than_5_6 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,6,2,7,4,9,8);
        long count = l.stream().filter(i -> i > 5).count();
        System.out.println(count);
    }
}
