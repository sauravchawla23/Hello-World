package Streams_api;

import java.util.Arrays;
import java.util.List;

public class Remove_duplicates_from_List {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineaaple","kiwi","banana","orange","guava","orange","kiwi");
        //to remove we will use distinct method which removes duplicates and keeps only
        //unique values

        fruits.stream().distinct().forEach(str-> System.out.println(str));
    }
}
