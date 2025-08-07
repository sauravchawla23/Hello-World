package Java_techie_stream_api;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class char_occurence_in_string_1 {
    public static void main(String[] args) {
        String s = "ilovejavatechie";
        String[] split = s.split("");
        Map<String, List<String>> collect = Arrays.stream(split)
                .collect(Collectors.groupingBy(s1 -> s1));
        System.out.println(collect);//{a=[a, a], c=[c], t=[t], e=[e, e, e], v=[v, v], h=[h], i=[i, i], j=[j], l=[l], o=[o]}

        Map<String, Long> collect1 = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        //Function.identity() - identity of each character
    }

}
