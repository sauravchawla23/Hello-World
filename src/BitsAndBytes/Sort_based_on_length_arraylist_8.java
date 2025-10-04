package BitsAndBytes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sort_based_on_length_arraylist_8 {
    public static void main(String[] args) {

        //sort according to alphabet wise
        List<String> l = Arrays.asList("aa","bbbbbb","bbb","a","aaaa","aaaaaa");
        List<String> list = l.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println(list);//[a, aa, aaaa, aaaaaa, bbb, bbbbbb]

        //sort according to length wise
        List<String> l1 = Arrays.asList("aa","bbbbbb","bbb","a","aaaa","aaaaaa");
        List<String> list1 = l1.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).toList();
        System.out.println(list1);//[a, aa, bbb, aaaa, bbbbbb, aaaaaa]

        //sort in desc according to alphabet wise
        List<String> l2 = Arrays.asList("aa","bbbbbb","bbb","a","aaaa","aaaaaa");
        List<String> list2 = l2.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println(list2);//[a, aa, aaaa, aaaaaa, bbb, bbbbbb]

        //sort in desc according to length wise
        List<String> l3 = Arrays.asList("aa","bbbbbb","bbb","a","aaaa","aaaaaa");
        List<String> list3 = l3.stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).toList();
        System.out.println(list3);//[a, aa, bbb, aaaa, bbbbbb, aaaaaa]
    }
}