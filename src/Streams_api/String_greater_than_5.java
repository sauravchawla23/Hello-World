package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_greater_than_5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineaaple","banana","orange","guava");
        fruits.stream().filter(f->f.length()>5).forEach(str-> System.out.println(str));
        List<String> collect = fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList());
        int  size= collect.size();
        System.out.println(size);
    }
}
