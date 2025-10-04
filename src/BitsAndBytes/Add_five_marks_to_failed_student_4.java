package BitsAndBytes;

import java.util.Arrays;
import java.util.List;

public class Add_five_marks_to_failed_student_4 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,56,33,37,32);
        List<Integer> list = marks.stream().filter(i -> i < 33).map(j -> j + 5).toList();
        System.out.println(list);
    }
}
