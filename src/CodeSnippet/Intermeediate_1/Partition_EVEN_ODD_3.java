package CodeSnippet.Intermeediate_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_EVEN_ODD_3 {
    public static void main(String[] args) {
        //one list contains even num and another list contains odd num
        //so we need to do partition so for that we have a method
        //partioningby so we need to use that and this method is presnt is
        //in the collectors

        //so partitioningBy method does like this here we pass the condition in partitionby method
        //and it makes the two list true - 2,4,6,8,10 and false-1,3,5,7,9

        //so in partitioning it divides group in true or false
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even num - "+ collect.get(true));
        System.out.println("Odd num - "+ collect.get(false));
    }
}
