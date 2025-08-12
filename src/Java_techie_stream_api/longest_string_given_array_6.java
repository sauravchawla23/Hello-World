package Java_techie_stream_api;

import java.util.Arrays;
import java.util.Optional;

public class longest_string_given_array_6 {
    public static void main(String[] args) {
        String a[] = {"aaa","bbbb","c","eeeee"};
        //1 way is this one
        String s = Arrays.stream(a)
        .max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse(null);
        //if we dont use .orElse(null) than it will give answer in optional class so we use .orElse(null)
        System.out.println(s);

        // we can do it with reduce method as well
        String s1 = Arrays.stream(a)
                .reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2).get();
        System.out.println(s1);


    }
}
