package Streams_interview_Questions;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class MIn_Max {
    public static void main(String[] args) {
        int arr[] = {9,9,11,11,7,2,5,4};
        Stream<Integer> boxed = Arrays.stream(arr).boxed();
        Stream<Integer> boxed1 = Arrays.stream(arr).boxed();

        Optional<Integer> min = boxed.min((a,b)->a.compareTo(b));
        Optional<Integer> max = boxed1.max((a, b) -> a.compareTo(b));

        System.out.println(min.get());
        System.out.println(max.get());

        // add all the values
        Stream<Integer> boxed2 = Arrays.stream(arr).boxed();
        Optional<Integer> reduce = boxed2.reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        //sort in descending order
        Stream<Integer> boxed3 = Arrays.stream(arr).boxed();
        boxed3.sorted((a,b)->b-a).forEach(x-> System.out.print(x+" "));

    }
}
