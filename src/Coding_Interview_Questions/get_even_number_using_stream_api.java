package Coding_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class get_even_number_using_stream_api {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        List<Integer> ans= l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(ans);
    }
}
