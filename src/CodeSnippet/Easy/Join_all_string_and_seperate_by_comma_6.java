package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join_all_string_and_seperate_by_comma_6 {
    public static void main(String[] args) {
        // output - saurav,aman,ashu,ayush,mangesh
        List<String> l = Arrays.asList("saurav","aman","ashu","ayush","mangesh");
        //Collectrs.joining - means it will join all the string like this sauravamanashuayushmangesh and in joining we set a delimiter as ,
        // so it will separate by comma
        String collect = l.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
