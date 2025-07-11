package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_First_word_starts_with_p {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pineapple","kiwi","banana","orange","guava","orange","kiwi","alpino","papaya");
        Optional<String> p = fruits.stream().filter(str -> str.startsWith("h")).findFirst();
        if(p.isPresent()){
            System.out.println(p.get());
        }

        //here suppose if i pass "h" in .startsWith("h") than findFirst() method it will not give exception
        // so here findFirst() method has null handels the null pointer exception



        // find the second word starts with p
        Optional<String> secondP = fruits.stream()
                .filter(str -> str.startsWith("p"))
                .skip(1) // Skip the first match
                .findFirst(); // Get the second match
        if(secondP.isPresent()){
            System.out.println(secondP.get());
        }
    }
}
