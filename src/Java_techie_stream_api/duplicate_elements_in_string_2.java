package Java_techie_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate_elements_in_string_2 {
    public static void main(String[] args) {
        String s = "ilovejavatechie";
        String[] split = s.split("");

        List<String> duplicate = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() > 1).map(m -> m.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicate);


        //unique elements
        List<String> unique = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() ==1).map(m -> m.getKey())
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
