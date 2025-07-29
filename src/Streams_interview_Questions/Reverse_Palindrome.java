package Streams_interview_Questions;

import java.util.Arrays;
import java.util.stream.IntStream;
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

        Stream<String> stringStream = Arrays.stream(s).filter(x -> isPalindrome(x));

        System.out.println("function palindrome ");
        stringStream.forEach(x-> System.out.println(x));


        System.out.println("normal for loop ");
        //by using loop in stream api
        IntStream.range(0,s.length).forEach(x-> System.out.println(s[x]));


    }

    public static boolean isPalindrome(String word) {
       return  IntStream.range(0,word.length()/2).allMatch(i->word.charAt(i)==word.charAt(word.length()-i-1));
    }
}
