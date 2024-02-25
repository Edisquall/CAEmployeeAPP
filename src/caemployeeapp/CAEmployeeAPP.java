/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caemployeeapp;

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
    }

}
