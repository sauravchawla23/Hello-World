package BitsAndBytes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Highest_salary_of_employee_10 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        List<Employee> e = Arrays.asList(
                new Employee("Saurav", 50000.0, sdf.parse("2022-01-15"), "Male"),
                new Employee("Anjali", 62000.0, sdf.parse("2021-06-10"), "Female"),
                new Employee("Ravi", 58000.0, sdf.parse("2023-03-20"), "Male"),
                new Employee("Neha", 70000.0, sdf.parse("2020-11-05"), "Female"),
                new Employee("Amit", 55000.0, sdf.parse("2022-08-25"), "Male")
        );

        //find the employee with highest salary
        Employee employee = e.stream().max((a, b) -> a.getSalary().compareTo(b.getSalary())).get();
        System.out.println(employee.getName()+" "+employee.getSalary());
        System.out.println(employee);


        //find the employee with second highest salary
        Employee employee1 = e.stream().sorted((a, b) -> b.getSalary().compareTo(a.getSalary())).skip(1).findFirst().get();
        System.out.println(employee1.getName()+" "+employee1.getSalary());
        System.out.println(employee1);

        //find the employee who is most senior based on joining date
        Employee employee2 = e.stream().min((a, b) -> a.getDate().compareTo(b.getDate())).get();
        System.out.println(employee2.getName());

        //count the employee based on gender male = 3,female=2
        Map<String, Long> collect = e.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

    }
}
