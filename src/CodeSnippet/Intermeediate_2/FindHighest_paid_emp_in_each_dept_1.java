package CodeSnippet.Intermeediate_2;

import CodeSnippet.Intermeediate_1.Employee_details;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighest_paid_emp_in_each_dept_1 {
    public static void main(String[] args) {

        //output
        //IT - manisha - 150000
        //civil - mamta - 250000
        //ece - ashu - 100000
        List<Employee_detail> list = Arrays.asList(
                new Employee_detail(1, "saurav", "IT", 50000),
                new Employee_detail(2, "manisha", "IT", 150000),
                new Employee_detail(3, "manish", "CIVIL", 55000),
                new Employee_detail(4, "mamta", "CIVIL", 250000),
                new Employee_detail(5, "ashu", "ECE", 100000),
                new Employee_detail(6, "ayush", "ECE", 90000)
        );

        Map<String, Optional<Employee_detail>> collect = list.stream().collect(Collectors.groupingBy(Employee_detail::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee_detail::getSalary))));
        System.out.println(collect);

    }
}
