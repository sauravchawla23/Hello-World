package BitsAndBytes;

import java.util.Date;

public class Employee {
    private String name;
    private Double salary;
    private Date date;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                '}';
    }

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(String name, Double salary, Date date, String gender) {
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.gender = gender;
    }
}
