package Streams_interview_Questions;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Skip_all_find_mid_value {
    public static void main(String[] args) {
        int arr[] = {9,11,7,2,5,4};
        //output = 7
        long mid = arr.length/2;
        IntStream first1 = Arrays.stream(arr).skip(mid).limit(1);
        first1.forEach(x-> System.out.println(x));
    }
}
