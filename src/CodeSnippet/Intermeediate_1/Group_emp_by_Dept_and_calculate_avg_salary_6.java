package CodeSnippet.Intermeediate_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Group_emp_by_Dept_and_calculate_avg_salary_6 {
    public static void main(String[] args) {
        //group emp by department and calculate avg salary by each department
        //output
        //{CIVIL=152500.0, ECE=95000.0, IT=100000.0}
        List<Employee_details> list = Arrays.asList(
                new Employee_details(1, "saurav", "IT", 50000),
                new Employee_details(2, "manisha", "IT", 150000),
                new Employee_details(3, "manish", "CIVIL", 55000),
                new Employee_details(4, "mamta", "CIVIL", 250000),
                new Employee_details(5, "ashu", "ECE", 100000),
                new Employee_details(6, "ayush", "ECE", 90000)
        );

        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Employee_details::getDepartment, Collectors.averagingDouble(Employee_details::getSalary)));
        System.out.println(collect);
    }
}
