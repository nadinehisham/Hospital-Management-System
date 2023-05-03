/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

/**
 *
 * @author Jumana
 */
public class EmergencyPatient extends NormalPatient {
    private String roomNo;

    public EmergencyPatient(String roomNo, String name, String nationalID, String phoneNumber, int salary, String address) {
        super(name, nationalID,phoneNumber, salary, address);
        this.roomNo = roomNo;
    }

    public EmergencyPatient() {
    }

    public EmergencyPatient(String roomNo, String gender, String paymentMethod, String diagnosis, String Prescription, String name, String nationalID, String phoneNumber, int salary, String address) {
        super(gender, paymentMethod, diagnosis, Prescription, name, nationalID, phoneNumber, salary, address);
        this.roomNo = roomNo;
    }

    

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Name="+ getName()+ "National ID="+ getNationalID()+ "phone number=" + getPhoneNumber()+ "Salary="+ getSalary()+ "Address=" + getAddress()+ "gender=" + getGender() + ", symptoms=" + getSymptoms() + ", paymentMethod=" + getPaymentMethod() + ", diagnosis=" + getDiagnosis() + ", Prescription=" + getPrescription()  + "roomNo=" + roomNo;
    }
    
}