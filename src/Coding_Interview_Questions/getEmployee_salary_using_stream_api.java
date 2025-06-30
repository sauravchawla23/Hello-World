package Coding_Interview_Questions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class getEmployee_salary_using_stream_api {
    public static void main(String[] args) {
        List<Employee> e = Arrays.asList(new Employee("saurav",1000),new Employee("manisha",11000),
                new Employee("manish",12000),new Employee("nitin",10000));

        List<Employee> collect = e.stream().filter(i -> i.getSalary() > 10000).collect(Collectors.toList());
        collect.forEach(emp -> System.out.println(emp.getName()));

    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
