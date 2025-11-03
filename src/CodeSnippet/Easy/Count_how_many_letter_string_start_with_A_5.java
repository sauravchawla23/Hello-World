package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;

public class Count_how_many_letter_string_start_with_A_5 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("saurav","aman","ashu","ayush","mangesh");
        long a = l.stream().filter(i -> i.startsWith("a")).count();
        System.out.println(a);
        List<String> a1 = l.stream().filter(i -> i.startsWith("a")).toList();
        System.out.println(a1);
    }
}
