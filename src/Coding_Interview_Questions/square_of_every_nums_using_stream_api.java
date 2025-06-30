package Coding_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class square_of_every_nums_using_stream_api {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4);
        l.stream().map(i -> i * i).forEach(j -> System.out.print(j+" "));


    }
}
