package BitsAndBytes;

import java.util.ArrayList;
import java.util.List;

public class Multiply_by_two_2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(1);
        List<Integer> list = l.stream().map(s -> s * 2).toList();
        System.out.println(list);
    }
}
