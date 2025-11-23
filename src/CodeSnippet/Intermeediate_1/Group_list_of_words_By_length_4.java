package CodeSnippet.Intermeediate_1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_list_of_words_By_length_4 {
    public static void main(String[] args) {
        //so for grouping the things we need to use the method grouping by
        //so in grouping by method we will pass the length so
        //the length will be the key and the and according to the length
        // what are the words are there they will be get in to that
        // ex : 5 - apple,mango so here 5 is the key and mango and apple are the values
        List<String> list = Arrays.asList("apple", "mango", "banana", "cat", "ball", "dog", "nose");
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(i -> i.length()));//we make the key based on length
        System.out.println(collect);//{3=[cat, dog], 4=[ball, nose], 5=[apple, mango], 6=[banana]}
    }
}
