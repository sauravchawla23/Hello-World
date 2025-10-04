package BitsAndBytes;

import java.util.Arrays;
import java.util.List;

public class Select_Passed_student_3 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,56,33,37,32);
        List<Integer> list = marks.stream().filter(i -> i >= 33).toList();
        System.out.println(list);
    }
}
