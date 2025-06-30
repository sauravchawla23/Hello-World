package Coding_Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class max_num_using_stream_api {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(9,4,2,7,12,5,3,1,7);
        Integer max = l.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();  // Extracts 12 from Optional

        System.out.println(max);
    }
}
