    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package caemployeeapp;
// GitHub link: https://github.com/Edisquall/CAEmployeeAPP
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

        //Contructor with default values
        public Employee() {
            this.name = "name";
            this.email = "email@gmail.com";
            this.empNum = nextEmpNum++;
        }
    // Contructor with parameters
        public Employee(String name, String email) {
            this.name = name;
            this.email = email;
            this.empNum = nextEmpNum++;
        }

    //setting up getters

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getEmpNum() {
            return empNum;
        }

        public static int getNextEmpNum() {
            return nextEmpNum;
        }

        //validating email
        public void setEmail(String email) {
            if (email.length() > 3) {
                this.email = email;
            } else {
                System.out.println("Email must contain 3 or more characters.");
            }
        }
    }

