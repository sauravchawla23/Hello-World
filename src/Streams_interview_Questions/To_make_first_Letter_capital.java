package Streams_interview_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class To_make_first_Letter_capital {
    public static void main(String[] args) {
        String s = "india is my country";
        String[] s1 = s.split(" ");
        IntStream.range(0,s1.length).forEach(x-> System.out.println(Character.toUpperCase(s1[x].charAt(0))+s1[x].substring(1)));
    }
}
