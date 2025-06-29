package Java;

import java.util.Scanner;

class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

class Employee {
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input for Employee
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        // Create objects using constructors
        Student student = new Student(studentName, studentId);
        Employee employee = new Employee(employeeName, employeeId);

        // Display details
        System.out.println("\n--- Student Details ---");
        student.displayDetails();

        System.out.println("\n--- Employee Details ---");
        employee.displayDetails();
        scanner.close();
    }
}
/*
 
Enter Student Name: Gowtham
Enter Student ID: 222
Enter Employee Name: Aakash
Enter Employee ID: 1

--- Student Details ---
Student Name: Gowtham
Student ID: 222

--- Employee Details ---
Employee Name: Aakash
Employee ID: 1
 */