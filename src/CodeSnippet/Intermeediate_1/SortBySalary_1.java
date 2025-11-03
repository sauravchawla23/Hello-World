package CodeSnippet.Intermeediate_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBySalary_1 {
    public static void main(String[] args) {
        List<Employee> l = Arrays.asList(
               new Employee(1,"saurav",87000),
               new Employee(2,"manisha",187000),
               new Employee(3,"manish",100000),
               new Employee(4,"mamta",287000)
        );

        //salary high to low
        List<Employee> list = l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(list);

        //low to high
        List<Employee> list1 = l.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        System.out.println(list1);
    }
}
