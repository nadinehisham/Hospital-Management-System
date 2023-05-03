/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

/**
 *
 * @author Jumana
 */
public abstract class Human {
    private String name;
    private String nationalID;
    private String phoneNumber;
    private int salary;
    private String address;

    public Human(String name, String nationalID, String phoneNumber, int salary, String address) {
        this.name = name;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.address = address;
    }
    public Human(){
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
  
    
    
}
