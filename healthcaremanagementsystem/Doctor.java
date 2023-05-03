/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Jumana
 */
public class Doctor extends Human {
	
	private String Department;
    private String Specialization;
    private int yearsOfExp;
    private String AppointedPatient;



   
	


@Override
	public String toString() {
		return "  Name: " + getName() + ",  NationalID: "+ getNationalID() +"Department: " + Department + ", Specialization: " + Specialization + ", yearsOfExp: " + yearsOfExp
				+ ", AppointedPatient: " + AppointedPatient  + ", Phone Number: " + getPhoneNumber() + ", Salary: " + getSalary()
				+ ", Address: " + getAddress();
	}

public String toStringDoctor() {
	return "Doctor [ Name(): " + getName() +  "Department: " + Department + ", Specialization: " + Specialization + ", yearsOfExp: " + yearsOfExp
			+ ", AppointedPatient: " + AppointedPatient +  "]";
}


public String getAppointedPatient() {
	return AppointedPatient;
}

public void setAppointedPatient(String appointedPatient) {
	AppointedPatient = appointedPatient;
}

public String getDepartment() {
        return Department;
    }



   public void setDepartment(String Department) {
        this.Department = Department;
    }



   public String getSpecialization() {
        return Specialization;
    }



   public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }



   public int getYearsOfExp() {
        return yearsOfExp;
    }



   public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }



   public Doctor(String Department, String Specialization, int yearsOfExp) {
        this.Department = Department;
        this.Specialization = Specialization;
        this.yearsOfExp = yearsOfExp;
    }



   public Doctor(String Department, String Specialization) {
        this.Department = Department;
        this.Specialization = Specialization;
    }
    
   
       public Doctor(String name,String nationalID, String phoneNumber,int salary,String address ,String Department, String Specialization, int yearsOfExp) {
        super(name, nationalID, phoneNumber, salary, address);
        this.Department = Department;
        this.Specialization = Specialization;
        this.yearsOfExp= yearsOfExp;
    }    

    public Doctor() {
    }
    
    public void checkDiagnosis(NormalPatient p){
        System.out.println(p.getDiagnosis());
    }
    
    public void addPrescription(NormalPatient p){
        Scanner input = new Scanner(System.in);
        input.close();
        String x = input.nextLine();
        p.setPrescription(x);
    }
    
}
