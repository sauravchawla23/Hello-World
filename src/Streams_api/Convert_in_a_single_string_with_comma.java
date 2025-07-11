package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_in_a_single_string_with_comma {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurav", "sky", "try", "manisha");
        String collect = list.stream().collect(Collectors.joining(","));//if we dont gve comma than it will give this output sauravskytrymanisha
        //Collectors.joining will be joining all the list of strings
        System.out.println(collect);
    }
}
