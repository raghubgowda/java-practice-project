package com.raghu;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeId, supervisorId;
        String name;
        System.out.println("Enter employee ID:");
        employeeId = scanner.nextInt();
        scanner.nextLine(); //This is needed to pick up the new line
        System.out.println("Enter employee name:");
        name = scanner.next();
        System.out.println("Enter supervisor ID:");
        supervisorId = scanner.nextInt();
        System.out.println(employeeId+" "+name+" "+supervisorId);
    }
}
