package Java_techie_stream_api;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first_repeat_char_in_string_4 {
    public static void main(String[] args) {
        String s = "ilovejavatechie";
        String[] split = s.split("");


        String s1 = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() > 1).map(m -> m.getKey()).findFirst()
                .get();
        System.out.println(s1);

    }
}
