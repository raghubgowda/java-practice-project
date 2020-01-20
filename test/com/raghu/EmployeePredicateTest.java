package com.raghu;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class EmployeePredicateTest {

    private EmployeePredicate employeePredicate = new EmployeePredicate();
    private List<Employee> employeeList = Arrays.asList(
            new Employee("Jason", 34, 2000),
            new Employee("Brent", 23, 55327),
            new Employee("Gary", 23, 34324),
            new Employee("William", 45, 4353),
            new Employee("Monica", 56, 6564),
            new Employee("Peter", 32, 23233));
    private Predicate<Employee> moreThanThirtyFiveAge = p -> p.age > 35;
    private Predicate<Employee> lessThanThirtyAge = p -> p.age > 30;
    private Predicate<Employee> moreThanFiftyThousandSalary = p -> p.salary > 50000;
    private Predicate<Employee> moreThanFiftyThousandSalaryAndAgeLessThanThirty = p -> p.salary > 50000 && p.age < 30;
    private Predicate<Employee> moreThanFiftyThousandSalaryAndAgeMoreThanThirty = p -> p.salary > 50000 && p.age > 30;

    @Test
    public void shouldFilterEmployeeWhoAreAgedMoreThanThirtyFive(){
        assertEquals(2, employeePredicate.filter(employeeList, moreThanThirtyFiveAge).size());
    }

    @Test
    public void shouldFilterEmployeeWhoAreAgedLessThanThirty(){
        assertEquals(4, employeePredicate.filter(employeeList, lessThanThirtyAge).size());
    }

    @Test
    public void shouldFilterEmployeeWhoseSalaryMoreThanFiftyThousand(){
        assertEquals(1, employeePredicate.filter(employeeList, moreThanFiftyThousandSalary).size());
    }

    @Test
    public void shouldFilterEmployeeWhoseSalaryMoreThanFiftyThousandAndAgeLessThanThirty(){
        assertEquals(1, employeePredicate.filter(employeeList, moreThanFiftyThousandSalaryAndAgeLessThanThirty).size());
    }

    @Test
    public void shouldFilterEmployeeWhoseSalaryMoreThanFiftyThousandAndAgeMoreThanThirty(){
        assertEquals(0, employeePredicate.filter(employeeList, moreThanFiftyThousandSalaryAndAgeMoreThanThirty).size());
    }
}