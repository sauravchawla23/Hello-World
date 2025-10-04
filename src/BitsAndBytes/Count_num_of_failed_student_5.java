package BitsAndBytes;

import java.util.Arrays;
import java.util.List;

public class Count_num_of_failed_student_5 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20,56,33,37,32);
        long count = marks.stream().filter(i -> i < 33).count();
        System.out.println(count);
    }
}
