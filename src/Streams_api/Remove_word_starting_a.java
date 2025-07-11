package Streams_api;

import java.util.Arrays;
import java.util.List;

public class Remove_word_starting_a {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino");
        fruits.stream().filter(f->!f.startsWith("a")).forEach(str-> System.out.println(str));
    }
}
