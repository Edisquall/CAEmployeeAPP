/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployeeapp;

/**
 *
 * @author Edi
 */
public class Employee {
    //Information from the users
    private String name;
    private String email;
    private int empNum;
    
    private static int nextEmpNum = 1;


   //validating email
    public void validateEmail (String email) {
        if (email.length() >3) {
            this.email = email;
        } else {
            System.out.println("Email must contain 3 or more characters.");
        }
        
    }
}
