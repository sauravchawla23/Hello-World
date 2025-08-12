package Java_techie_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class second_highest_number_5 {
    public static void main(String[] args) {
        int arr[]  = {43,3,2,1,4};
        Optional<Integer> first = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(first.get());
    }
}
