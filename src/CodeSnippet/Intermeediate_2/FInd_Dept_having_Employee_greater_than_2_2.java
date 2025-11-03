package CodeSnippet.Intermeediate_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FInd_Dept_having_Employee_greater_than_2_2 {

    // so we need departemnts having employee more than 2 so IT and civil dept having emp more than 2
    public static void main(String[] args) {
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

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee_detail::getDepartment, Collectors.counting()));
        System.out.println(collect);//{CIVIL=3, ECE=2, IT=3}

        //to convert map to stream we use this method entrySet() by using this method we can use stream()
        List<Map.Entry<String, Long>> list1 = collect.entrySet().stream().filter(i -> i.getValue() > 2)
                .toList();
        System.out.println(list1);//[CIVIL=3, IT=3]

        //if u want only names of the department
        List<String> list2 = collect.entrySet().stream().filter(i -> i.getValue() > 2).
                map(i -> i.getKey()).toList();
        System.out.println(list2);//[CIVIL, IT]


        //so here in above we have created two pipelines one to give dept and the employee count and second gives
        //only the department having employee greater than 3

        //but we can make it in one pipeline as well
        List<String> list3 = list.stream().collect(Collectors.groupingBy(Employee_detail::getDepartment, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 2).map(i -> i.getKey()).
                toList();
        System.out.println(list3);

    }
}
