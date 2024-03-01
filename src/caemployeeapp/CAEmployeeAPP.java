/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caemployeeapp;

import java.util.Scanner;

/**
 *
 * @author Edi
 */
public class CAEmployeeAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating 3 employee objects

        Employee employee1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");

        //Array for employee
        Employee[] projectGroup = {employee1, employee2, employee3};

        //Priting value of nextEmpNum
        System.out.println("Value of NextEmpNum: " + Employee.getNextEmpNum());

        //Displaying name of each employee
        int m = 1;
        System.out.println("Here it is all the employees with the empNUm above " + m + ":");
        for (Employee empLoop : projectGroup) {
            if (empLoop.getEmpNum() > m) {
                System.out.println(empLoop.getName());
            }
        }
      // Menu System
      // Create an instance of EmpManager
        EmpManager manager = new EmpManager();
        
        
         // Set the manager's username and password
        manager.setUsername("Gnomeo");
        manager.setPassword("smurf");
        
         // Scanner for user input
        Scanner scanner = new Scanner(System.in);

       // Login loop
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Display menu options
        System.out.println("Menu:");
        System.out.println("1. View current staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Exit");

        // Process user input
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    // View current staff
                    for (Employee empLoop : projectGroup) {
                        System.out.println(empLoop.getName());
                    }
                    break;
                case 2:
                    // Add new staff
                    System.out.println("Enter name of the new employee:");
                    String name = scanner.nextLine();
                    System.out.println("Enter email of the new employee:");
                    String email = scanner.nextLine();
                    Employee newEmployee = new Employee(name, email);
                    manager.addNewStaff(newEmployee);
                    System.out.println("New employee added successfully!");
                    break;
                case 3:
                    // Exit
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}