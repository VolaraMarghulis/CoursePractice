package Lessons.Lesson10Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee employee1 = new FullTimeEmployee("Ion",2500);
        FullTimeEmployee employee2 = new FullTimeEmployee("Vasile", 2800);
        PartTimeEmployee employee3 = new PartTimeEmployee("Anna",17.50, 23);
        Freelance employee4 = new Freelance("Stephan",1200);
        employee1.calculateSalary();
        employee2.calculateSalary();
        employee3.calculateSalary();
        employee4.calculateSalary();
        List<String> employees = new ArrayList<>();
        employees.add(employee1.toString());
        employees.add(employee2.toString());
        employees.add(employee3.toString());
        employees.add(employee4.toString());

        employees.stream().forEach(System.out::println);
    }

}

