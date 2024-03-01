/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployeeapp;

import java.util.ArrayList;

/**
 *
 * @author Edi
 */
public class EmpManager {
    // Info from designed manager
    private String Name;
    private String email;
    private String username;
    private String password;
    private ArrayList<Employee> staff;
    //Getter and Setter for username and password.
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     // Method to add new staff
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

}
