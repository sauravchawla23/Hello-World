package CodeSnippet.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Find_avg_number_in_a_list_2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);

        // We convert Stream<Integer> into IntStream using mapToInt()
        // because methods like sum(), average(), max(), and min()
        // are available only for primitive streams (IntStream, LongStream, DoubleStream),
        // not for Stream<Integer>.
        OptionalDouble average = l.stream().mapToInt(i->i).average();
        System.out.println(average.getAsDouble());

        //if not able to find avg return 0.0
        double v = l.stream().mapToInt(i -> i).average().orElse(0.0);
        System.out.println(v);
    }
}
