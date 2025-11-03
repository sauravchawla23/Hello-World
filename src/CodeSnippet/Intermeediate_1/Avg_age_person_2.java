package CodeSnippet.Intermeediate_1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Avg_age_person_2 {
    public static void main(String[] args) {
        List<Person> l = Arrays.asList(
          new Person("Saurav",28),
          new Person("manisha",23),
          new Person("manish",30),
          new Person("mamta",50)
        );

        OptionalDouble average = l.stream().mapToInt(i -> i.getAge()).average();
        System.out.println(average.getAsDouble());
    }
}
