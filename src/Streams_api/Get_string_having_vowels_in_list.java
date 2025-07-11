package Streams_api;

import java.util.Arrays;
import java.util.List;

public class Get_string_having_vowels_in_list {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurav", "sky", "try", "manisha");
        list.stream()
                .filter(str -> str.matches(".*[aeiou].*"))//by using regular expression
                .forEach(System.out::println);

        list.stream()
                .filter(str -> str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
                .forEach(System.out::println);
    }
}
