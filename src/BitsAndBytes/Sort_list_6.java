package BitsAndBytes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sort_list_6 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,56,33,37,32);
        List<Integer> list = marks.stream().sorted().toList();
        System.out.println(list);
    }
}
