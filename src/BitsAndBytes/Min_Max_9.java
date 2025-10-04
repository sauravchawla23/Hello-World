package BitsAndBytes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min_Max_9 {
    public static void main(String[] args) {
        //first converted into desc and it becomes
        // 36,23,10,3,1
        // and 36 is at the min position so output is 36
        // so min and max works on indexing first and last
        List<Integer> l = Arrays.asList(23,3,10,36,1);
        Integer i = l.stream().min((a, b) -> b.compareTo(a)).get();
        System.out.println(i);


        //first converted into desc and it becomes
        // 36,23,10,3,1
        // and 1 is at the last position so output is 1
        // so min and max works on indexing first and last
        List<Integer> l1 = Arrays.asList(23,3,10,36,1);
        Integer i1 = l1.stream().max((a, b) -> b.compareTo(a)).get();
        System.out.println(i1);

        //a.compareTo(b) - then it will sort in asc order and give answer according
        // to index
         }
}
