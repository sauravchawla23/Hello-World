package Streams_api;

import java.util.Arrays;
import java.util.List;

public class List_having_particular_word {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino");
        fruits.stream().filter(f->f.contains("w")).forEach(str-> System.out.println(str));
        fruits.stream().filter(f->f.contains("apple")).forEach(str-> System.out.println(str));

    }
}
