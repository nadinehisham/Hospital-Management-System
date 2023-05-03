/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author Jumana
 */
public class NormalPatient extends Human {
	 private String gender;
	    private ArrayList<String> symptoms = new ArrayList<String>();
	    private String paymentMethod;
	    private String diagnosis;
	    private String Prescription;
	    private String AppointedDoctor;
	    
	    public String getAppointedDoctor() {
			return AppointedDoctor;
		}



		public void setAppointedDoctor(String appointedDoctor) {
			AppointedDoctor = appointedDoctor;
		}



		public NormalPatient() {
	    	
	    }



	   public NormalPatient(String name, String nationalID, String phoneNumber, int salary, String address) {
	        super(name, nationalID, phoneNumber, salary, address);
	    }
	    
	    



	   public NormalPatient(String gender, String paymentMethod, String diagnosis, String Prescription, String name, String nationalID, String phoneNumber, int salary, String address) {
	        super(name, nationalID, phoneNumber, salary, address);
	        this.gender = gender;
	        this.paymentMethod = paymentMethod;
	        this.diagnosis = diagnosis;
	        this.Prescription = Prescription;
	    }
	    
	       public NormalPatient(String gender, String paymentMethod, String diagnosis, String Prescription) {
	       
	        this.gender = gender;
	        this.paymentMethod = paymentMethod;
	        this.diagnosis = diagnosis;
	        this.Prescription = Prescription;
	    }
	    
	    
	    



	   public String getPrescription() {
	        return Prescription;
	    }



	   public void setPrescription(String Prescription) {
	        this.Prescription = Prescription;
	    }



	   public ArrayList<String> getSymptoms() {
	        return symptoms;
	    }



	   public void setSymptoms(String symptom) {
	        symptoms.add(symptom);
	    }



	   public String getGender() {
	        return gender;
	    }



	   public void setGender(String gender) {
	        this.gender = gender;
	    }



	   public String getPaymentMethod() {
	        return paymentMethod;
	    }



	   public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }



	   public String getDiagnosis() {
	        return diagnosis;
	    }



	   public void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	    }

    @Override
    public String toString() {
        return " Name: " + getName()  + ", gender=" + gender + ", symptoms=" + symptoms + ", paymentMethod=" + paymentMethod + ", diagnosis=" + diagnosis + ", Prescription=" + Prescription + ", AppointedDoctor=" + AppointedDoctor;
    }
	    
           
}