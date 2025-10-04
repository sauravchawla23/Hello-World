package BitsAndBytes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_desc_7 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,56,33,37,32);
        List<Integer> list = marks.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);

        List<Integer> mark = Arrays.asList(20,56,33,37,32);
        List<Integer> list1 = mark.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(list1);
    }
}
