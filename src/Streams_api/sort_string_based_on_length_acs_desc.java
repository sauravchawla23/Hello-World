package Streams_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_string_based_on_length_acs_desc {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino","papaya");
        //ascending
        fruits.stream().
                sorted(Comparator.comparingInt(String::length))//(String::length) this is method refrence
                .forEach(s-> System.out.println(s));

        //descending
        fruits.stream().
                sorted(Comparator.comparingInt(String::length).reversed()).forEach(s-> System.out.println(s));
    }
}
