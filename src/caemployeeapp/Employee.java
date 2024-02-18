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

    //Contructor
    public Employee(String name, String email, int empNum) {
        this.name = name;
        this.email = email;
        this.empNum = empNum;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getEmpNum() {
        return empNum;
    }
    //Getting nextEMpNum
   public static int getNextEmpNum() {
       return nextEmpNum;
   }
    
        
    }
}
