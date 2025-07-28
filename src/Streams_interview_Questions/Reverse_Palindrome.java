package Streams_interview_Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Reverse_Palindrome {
    public static void main(String[] args) {
        String[] s = {"abc","aaa","aba","abd"};

        //this is reverse of each word
        Stream<StringBuilder> stringBuilderStream = Arrays.stream(s).map(x -> new StringBuilder(x).reverse());
        stringBuilderStream.forEach(x-> System.out.println(x));

        //find palindrome string
        System.out.println("palindrome");

        Arrays.stream(s).filter(x -> x.equals(new StringBuilder(x).reverse().toString())).forEach(a-> System.out.println(a));



    }
}
