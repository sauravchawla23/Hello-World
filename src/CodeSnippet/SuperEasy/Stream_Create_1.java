package CodeSnippet.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Create_1 {
    public static void main(String[] args) {
        // convert list to Stream

        //1: List -> Stream
        List<String> names = Arrays.asList("ALice","Bob");
        Stream<String> stream = names.stream();

        //2: Array to stream
        String arr[]  = {"Saurav","manisha","manish"};
        Stream<String> stream1 = Arrays.stream(arr);

        //3: Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        
    }
}
