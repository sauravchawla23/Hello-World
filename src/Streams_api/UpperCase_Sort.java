package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase_Sort {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineaaple","banana","orange","guava");
        fruits.stream().map(m->m.toUpperCase()).
                sorted().forEach(str-> System.out.println(str));
        //by using Collectors.tolist

        List<String> collect = fruits.stream().map(m -> m.toUpperCase()).
                sorted().collect(Collectors.toList());
        System.out.println(collect);
        for(int i=0;i< collect.size();i++){
            System.out.println(collect.get(i));
        }
    }
}
