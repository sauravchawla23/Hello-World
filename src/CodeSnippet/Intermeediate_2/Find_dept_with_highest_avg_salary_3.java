package CodeSnippet.Intermeediate_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_dept_with_highest_avg_salary_3 {
    public static void main(String[] args) {
        //we need a department with highest avg salary
        List<Employee_detail> list = Arrays.asList(
                new Employee_detail(1, "saurav", "IT", 50000),
                new Employee_detail(2, "manisha", "IT", 150000),
                new Employee_detail(3, "manish", "CIVIL", 55000),
                new Employee_detail(4, "mamta", "CIVIL", 250000),
                new Employee_detail(5, "ashu", "ECE", 100000),
                new Employee_detail(6, "ayush", "ECE", 90000),
                new Employee_detail(7, "manu", "IT", 130000),
                new Employee_detail(8, "Uma", "CIVIL", 140000)
        );

        Map.Entry<String, Double> stringDoubleEntry = list.stream().collect(Collectors.groupingBy(Employee_detail::getDepartment,
                Collectors.averagingDouble(Employee_detail::getSalary))).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(stringDoubleEntry);
    }
}
