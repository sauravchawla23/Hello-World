package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Get_length_of_each_name_in_a_list {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino","papaya");
        List<Integer> collect = fruits.stream().map(m -> m.length()).collect(Collectors.toList());
        for (int i=0;i<collect.size();i++){
            System.out.println(fruits.get(i)+"-"+collect.get(i));
        }
    }
}
