package Streams_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Longest_string_in_list {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino","papaya");
        Optional<String> max = fruits.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max.get().toUpperCase());
    }
}
