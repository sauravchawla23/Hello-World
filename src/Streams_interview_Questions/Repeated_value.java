package Streams_interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Repeated_value {
    public static void main(String[] args) {
        int arr[] = {9,9,11,11,7,2,5,4};

        Set<Integer> s = new HashSet<>();

        Stream<Integer> boxed = Arrays.stream(arr).boxed().filter(a->!s.add(a));
        boxed.forEach(a-> System.out.println(a));

    }
}
