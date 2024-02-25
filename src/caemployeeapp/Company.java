/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployeeapp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Edi
 */
public class Company {

    private String companyName;
    private ArrayList<Employee> staff;

    
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
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

    // Getting the number cuurently employee
    public int getStaffNumber() {
        return staff.size();
    }

    //Setting getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // List of employee
    public void listEmployees(int empNumValue) {
        Iterator <Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNumValue) {
                System.out.println(employee.getName());
            }
        }

    }
}
