package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_list_in_desc_4 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,1,6,3,5,4);

        //in desc order it will print
        List<Integer> list = l.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);

        //if u want to remove duplicates
        List<Integer> list1 = l.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);



    }
}
