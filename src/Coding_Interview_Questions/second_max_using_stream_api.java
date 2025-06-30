package Coding_Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class second_max_using_stream_api {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4,2,16,3,6,15,15,7,5,9,13,13);
        Integer i = l.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(i);
    }
}
