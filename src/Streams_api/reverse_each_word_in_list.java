package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverse_each_word_in_list {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurav", "sky", "try", "manisha");
        list.stream().map(m->new StringBuilder(m).reverse()).forEach(str-> System.out.println(str));
    }
}
