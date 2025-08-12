package Java_techie_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class print_num_start_with_1_7 {
    public static void main(String[] args) {
        int arr[] = {2,11,1,45,123};
        List<Integer> collect = Arrays.stream(arr).boxed().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
