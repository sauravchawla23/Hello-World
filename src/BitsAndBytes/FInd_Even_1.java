package BitsAndBytes;

import java.util.*;
import java.util.stream.Collectors;

public class FInd_Even_1 {
    public static void main(String[] args) {
       List<Integer> l = Arrays.asList(5,10,2,3,8,6);
       List<Integer> collect = l.stream().filter(s -> s % 2 == 0).toList();
       System.out.println(collect);
    }
}
