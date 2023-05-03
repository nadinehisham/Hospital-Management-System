/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

/**
 *
 * @author Jumana
 */
public class Nurse extends Human {
      private String department;
        private int yearsOfExp;
        private String room;

 

 

       public Nurse(String department, int yearsOfExp, String room, String name, String nationalID, String phoneNumber, int salary, String address) {
            super(name, nationalID, phoneNumber, salary, address);
            this.department = department;
            this.yearsOfExp = yearsOfExp;
            this.room = room;
        }

    Nurse() {
    }

        
        
        
    @Override
        public String toString() {
            return " Name: " + getName() + ",NationalID: "+ getNationalID()+ ", Phone Number: " + getPhoneNumber() + ", Salary: " + getSalary()
				+ ", Address: " + getAddress() + "department=" + department + ", yearsOfExp=" + yearsOfExp + ", room=" + room + '}';
        }

    public String getDepartment() {
        return department;
    }

 

 

       public void setDepartment(String department) {
            this.department = department;
        }

 

 

       public int getYearsOfExp() {
            return yearsOfExp;
        }

 

 

       public void setYearsOfExp(int yearsOfExp) {
            this.yearsOfExp = yearsOfExp;
        }

 

 

       public String getRoom() {
            return room;
        }

 

 

       public void setRoom(String room) {
            this.room = room;
        }
}