package com.raghu;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
    public List<Employee> filter(List<Employee> employeeList, Predicate<Employee> predicate){
        return employeeList.stream().filter(predicate).collect(Collectors.toList());
    }
}

class Employee{
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
