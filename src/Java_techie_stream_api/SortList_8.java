package Java_techie_stream_api;

import java.util.Arrays;
import java.util.List;

public class SortList_8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 3);
        System.out.println("in Ascending");
        // Ascending
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("in descending");
        // Descending
        list.stream()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);
    }
}

