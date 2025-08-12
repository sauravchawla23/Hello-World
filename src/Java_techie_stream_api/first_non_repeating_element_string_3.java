package Java_techie_stream_api;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first_non_repeating_element_string_3 {
    public static void main(String[] args) {
        String s = "ilovejavatechie";
        String[] split = s.split("");
        String s1 = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() == 1).map(m -> m.getKey())
                .findFirst().get();
        System.out.println(s1);

    }
}
