package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;

public class Check_positive_7 {
    public static void main(String[] args) {

        //check if all the elements are positive in a list so we need output in boolean
        List<Integer> l = Arrays.asList(1,2,3,-1,4);
        //The allMatch() method in Stream API checks whether all elements in the stream satisfy a given condition (a boolean test).
        boolean b = l.stream().allMatch(i -> i > 0); // each element will go one by one and checks the condition
        System.out.println(b);//false
    }
}
