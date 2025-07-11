package Streams_api;

import java.util.Arrays;
import java.util.List;

public class remove_empty_null_in_a_list {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("",null,"saurav",null,"try","");
        l.stream().filter(str->str!=null && (!str.isEmpty())).forEach(s-> System.out.println(s));
    }
}
