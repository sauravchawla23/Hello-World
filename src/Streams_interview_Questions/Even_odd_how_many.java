package Streams_interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Even_odd_how_many {
    public static void main(String[] args) {
        int arr[] = {9, 11, 7, 2, 5, 4};
        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> integers = collect.get(Boolean.TRUE);
        System.out.println(integers);
        System.out.println(integers.stream().count());

        List<Integer> integers1 = collect.get(Boolean.FALSE);
        System.out.println(integers1);
        System.out.println(integers1.stream().count());

    }

}
