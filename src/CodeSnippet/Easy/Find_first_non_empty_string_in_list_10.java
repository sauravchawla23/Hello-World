package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_first_non_empty_string_in_list_10 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("","","saurav","");
        Optional<String> first = l.stream().filter(i -> !i.isEmpty()).findFirst();
        System.out.println(first.get());
    }
}
