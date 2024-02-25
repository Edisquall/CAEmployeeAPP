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
public class Company {
    private String companyName;
    private ArrayList <String> staff;
    
    // Constructor which initialises all fields

    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }
    // Constructor with name values as a parameter
    public Company(String companyName, ArrayList<String> staff) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    //Add new staff
    public void addNewStaff(){
        staff.add();
    }
    
}
