/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

/**
 *
 * @author Jumana
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public  class Hospital {
	 private String name;
	    private String address;
	    
	    private static ArrayList<String> AvailableDepts= new ArrayList<String>();
	    
	    static List <Doctor> doctorslist = new ArrayList<Doctor> ();
	    static List <Nurse> nurseslist = new ArrayList<Nurse> ();
	    
	    static List <NormalPatient> normalpatientslist = new ArrayList<NormalPatient> ();
	    static List <EmergencyPatient> emergencypatientslist = new ArrayList<EmergencyPatient> ();
	    
	    
	   public Hospital() {
	      
	    }



	   public Hospital(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }
	   



	  public String getName() {
	        return name;
	    }





	  public void setName(String name) {
	        this.name = name;
	    }





	  public String getAddress() {
	        return address;
	    }





	  public void setAddress(String address) {
	        this.address = address;
	    }





	  public void getAvailableDepts() {
	       for (int i=0; i< AvailableDepts.size(); i++){
	        System.out.println(AvailableDepts.get(i) + " ");
	       }
	    }





	  public void setAvailableDepts(String s) {
	        AvailableDepts.add(s);
	    }



	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	  public static void displayDoctors() {
	        for(int i = 0; i < doctorslist.size(); i++){
	            
                    System.out.println(doctorslist.get(i).toString());
	        }
	    }





	  public static void addDoctor (String name, String nationalID, String phoneNumber, int salary, String address, String Department, String Specialization, int yearsOfExp ) {
	       doctorslist.add(new Doctor(name, nationalID,  phoneNumber, salary, address , Department,  Specialization, yearsOfExp));
	        
	    }
	   
	   
	   
	    public static void displayNormalPatients() {
	        for(int i = 0; i < normalpatientslist.size(); i++){
	            System.out.println(normalpatientslist.get(i)+ " ");  
	        }
	    }





	  public static void addNormalPatient(String gender, String paymentMethod, String diagnosis, String Prescription, String name, String nationalID, String phoneNumber, int salary, String address ) {
	       normalpatientslist.add(new NormalPatient(gender, paymentMethod, diagnosis, Prescription, name, nationalID, phoneNumber, salary, address));
	        
	    }
	   
	   
	      public static void displayEmergencyPatients() {
	        for(int i = 0; i < emergencypatientslist.size(); i++){
	            System.out.println(emergencypatientslist.get(i)+ " ");  
	        }
	    }





	  public static void addEmergencyPatient(String roomNo, String gender, String paymentMethod, String diagnosis, String Prescription, String name, String nationalID, String phoneNumber, int salary, String address ) {
	       emergencypatientslist.add(new EmergencyPatient(  roomNo,  gender,  paymentMethod,  diagnosis,  Prescription,  name,  nationalID,  phoneNumber,  salary,  address));
	        
	    }
	   
	   
	   
	   
	    public static void displayNurses() {
	        for(int i = 0; i < nurseslist.size(); i++){
	            System.out.println(nurseslist.get(i)+ " ");  
	        }
	    }
	    
	     public static void addNurse (String name, String nationalID, String phoneNumber, int salary, String address, String department, int yearsOfExp, String room  ) {
	       nurseslist.add(new Nurse( department, yearsOfExp, room,  name, nationalID,  phoneNumber,  salary, address));
	        
	    }
	     
	    
	    
	     



	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	    public static void deleteDoctor (String ID){
	         for (int i=0 ; i< doctorslist.size(); i++){
	             if (doctorslist.get(i).getNationalID().equals(ID)){
	                 doctorslist.remove(i);
	             }
	         }
	     }
	     
	      public static void deleteNurse (String ID){
	         for (int i=0 ; i< nurseslist.size(); i++){
	             if (nurseslist.get(i).getNationalID().equals(ID)){
	                 nurseslist.remove(i);
	             }
	         }
	     }
	      
	       public static void deleteNormalPatient (String ID){
	         for (int i=0 ; i< normalpatientslist.size(); i++){
	             if (normalpatientslist.get(i).getNationalID().equals(ID)){
	                 normalpatientslist.remove(i);
	             }
	         }
	     }
	       
	        public static void deleteEmergencyPatient (String ID){
	         for (int i=0 ; i< emergencypatientslist.size(); i++){
	             if (emergencypatientslist.get(i).getNationalID().equals(ID)){
	                 emergencypatientslist.remove(i);
	             }
	         }
	     }
	        
	      
	       
	       public static void setAppointment (NormalPatient p ) {
	    	   
	    	 System.out.println("Please choose which doctor you would like to see:");
	    	 
	    	 for(int i = 0; i < doctorslist.size(); i++){
		            System.out.println((i+1)+")"+( doctorslist.get(i)).toStringDoctor()+ "\n");  
		        }
	    	 
	 while(1>=1) {  
	     Scanner input= new Scanner(System.in);
	     int num= input.nextInt();
             String bb = input.nextLine();
	    
	   	  
	  if (num> 0 && num<= doctorslist.size()) {
		 p.setAppointedDoctor(doctorslist.get(num-1).getName());
		 doctorslist.get(num-1).setAppointedPatient(p.getName());
		 break;
	 }
	 else
	 {
		 System.out.println("Sorry, your choice is not valid please choose again");
	 }
	  }
	       }
	  
	       public static void editDoctor (Doctor d){
	    	    System.out.println("Choose the attribute you want to edit: 1) name 2) national ID \n"
                            + "3) phone number 4) salary 5) address 6) department \n"
                            + "7) specialization 8) years of experience");
	    	    
	    	   Scanner input = new Scanner (System.in);
	    	   int x = input.nextInt();
                   String abc = input.nextLine();
	    	  
	    	   switch(x){
	    	       case 1:
	    	           System.out.println("Please insert the new name ");
	    	           String a= input.nextLine();
	    	           d.setName(a);
	    	           break;
	    	       case 2:
	    	           System.out.println("Please insert the new national ID ");
	    	           String b= input.nextLine();
	    	           d.setNationalID(b);
	    	           break;
	    	       case 3:
	    	           System.out.println("Please insert the new phone number ");
	    	           String c= input.nextLine();
	    	           d.setPhoneNumber(c);
	    	           break;
	    	       case 4:
	    	           System.out.println("Please insert the new salary ");
	    	           int e= input.nextInt();
                           String bbb = input.nextLine();
	    	           d.setSalary(e);
	    	           break;
	    	       case 5: 
	    	           System.out.println("Please insert the new address ");
	    	           String f= input.nextLine();
	    	           d.setAddress(f);
	    	           break;
	    	       case 6:
	    	           System.out.println("Please insert the new department ");
	    	           String g= input.nextLine();
	    	           d.setDepartment(g);
	    	           break;
	    	       case 7:
	    	           System.out.println("Please insert the new Specialization ");
	    	           String h= input.nextLine();
	    	           d.setSpecialization(h);
	    	           break;
	    	       case 8:
	    	           System.out.println("Please insert the new number of years of experience ");
	    	           int i= input.nextInt();
                           String bbbb = input.nextLine();
	    	           d.setYearsOfExp(i);
	    	           break;

	    	   }
	    	       
	    	}


	    	//nurse

	    	public static void editNurse (Nurse n){
	    	    System.out.println(" Choose the attribute you want to edit: 1) name 2) national ID \n"
                            + "3) phone number 4) salary 5) address 6) department \n"
                            + "7) years of experience 8) room");
	    	    
	    	   Scanner input = new Scanner (System.in);
	    	   int x = input.nextInt();
                   String abcc = input.nextLine();
	    	  
	    	   switch(x){
	    	       case 1:
	    	           System.out.println("Please insert the new name ");
	    	           String a= input.nextLine();
	    	           n.setName(a);
	    	           break;
	    	       case 2:
	    	           System.out.println("Please insert the new national ID ");
	    	           String b= input.nextLine();
	    	           n.setNationalID(b);
	    	           break;
	    	       case 3:
	    	           System.out.println("Please insert the new phone number ");
	    	           String c= input.nextLine();
	    	           n.setPhoneNumber(c);
	    	           break;
	    	       case 4:
	    	           System.out.println("Please insert the new salary ");
	    	           int e= input.nextInt();
                           String cc = input.nextLine();
	    	           n.setSalary(e);
	    	           break;
	    	       case 5: 
	    	           System.out.println("Please insert the new address ");
	    	           String f= input.nextLine();
	    	           n.setAddress(f);
	    	           break;
	    	       case 6:
	    	           System.out.println("Please insert the new department ");
	    	           String g= input.nextLine();
	    	           n.setDepartment(g);
	    	           break;
	    	       case 7:
	    	           System.out.println("Please insert the new number of years of experience ");
	    	           int h= input.nextInt();
                           String ccc = input.nextLine();
	    	           n.setYearsOfExp(h);
	    	           break;
	    	           
	    	       case 8:
	    	           System.out.println("Please insert the new room ");
	    	           String i= input.nextLine();
	    	           n.setRoom(i);
	    	           break;

	    	   }
	    	       
	    	}
	    	// patient

	    	public static void editNormalPatient (NormalPatient p){
	    	    System.out.println("Choose the attribute you want to edit: 1) name 2) national ID \n"
                            + "3) phone number 4) salary 5) address 6) symptoms \n"
                            + " 7) payment method 8) diagnosis 9) prescription ");
	    	    
	    	   Scanner input = new Scanner (System.in);
	    	   int x = input.nextInt();
                   String cccc = input.nextLine();
	    	   
	    	   switch(x){
	    	       case 1:
	    	           System.out.println("Please insert the new name ");
	    	           String a= input.nextLine();
	    	           p.setName(a);
	    	           break;
	    	       case 2:
	    	           System.out.println("Please insert the new national ID ");
	    	           String b= input.nextLine();
	    	           p.setNationalID(b);
	    	           break;
	    	       case 3:
	    	           System.out.println("Please insert the new phone number ");
	    	           String c= input.nextLine();
	    	           p.setPhoneNumber(c);
	    	           break;
	    	       case 4:
	    	           System.out.println("Please insert the new salary ");
	    	           int e= input.nextInt();
                           String ccccc = input.nextLine();
	    	           p.setSalary(e);
	    	           break;
	    	       case 5: 
	    	           System.out.println("Please insert the new address ");
	    	           String f= input.nextLine();
	    	           p.setAddress(f);
	    	           break;
	    	       case 6:
	    	           System.out.println("Please insert the number of symptoms then insert the new symptoms ");
	    	           int numofsymp = input.nextInt();
                           String cccccc = input.nextLine();
	    	           for (int i=0; i< numofsymp; i++){
	    	               
	    	                String g= input.nextLine();
	    	                 p.getSymptoms().set(i, g);
	    	           }
	    	           break;
	    	       case 7:
	    	           System.out.println("Please insert the new payment method ");
	    	           String h= input.nextLine();
	    	           p.setPaymentMethod(h);
	    	           break;
	    	           
	    	       case 8:
	    	           System.out.println("Please insert the new diagnosis ");
	    	           String i= input.nextLine();
	    	           p.setDiagnosis(i);
	    	           break;
	    	       case 9:
	    	           System.out.println("Please insert the new prescription ");
	    	           String j= input.nextLine();
	    	           p.setPrescription(j);
	    	           break;

	    	   }
	    	       
	    	}

	    	// Emergency patient

	    	public static void editEmergencyPatient (EmergencyPatient p){
	    	    System.out.println("Choose the attribute you want to edit: 1) name 2) national ID \n"
                            + "3) phone number 4) salary 5) address 6) symptoms \n "
                            + "7) payment method 8) diagnosis 9) prescription 10) room ");
	    	    
	    	   Scanner input = new Scanner (System.in);
	    	   int x = input.nextInt();
                   String ccccccc = input.nextLine();
	    	
	    	   switch(x){
	    	       case 1:
	    	           System.out.println("Please insert the new name ");
	    	           String a= input.nextLine();
	    	           p.setName(a);
	    	           break;
	    	       case 2:
	    	           System.out.println("Please insert the new national ID ");
	    	           String b= input.nextLine();
	    	           p.setNationalID(b);
	    	           break;
	    	       case 3:
	    	           System.out.println("Please insert the new phone number ");
	    	           String c= input.nextLine();
	    	           p.setPhoneNumber(c);
	    	           break;
	    	       case 4:
	    	           System.out.println("Please insert the new salary ");
	    	           int e= input.nextInt();
                           String cccccccc = input.nextLine();
	    	           p.setSalary(e);
	    	           break;
	    	       case 5: 
	    	           System.out.println("Please insert the new address ");
	    	           String f= input.nextLine();
	    	           p.setAddress(f);
	    	           break;
	    	       case 6:
	    	           System.out.println("Please insert the number of symptoms then insert the new symptoms ");
	    	           int numofsymp = input.nextInt();
                           String abccc = input.nextLine();
	    	           for (int i=0; i< numofsymp; i++){
	    	               
	    	                String g= input.nextLine();
	    	                 p.getSymptoms().set(i, g);
	    	           }
	    	           break;
	    	       case 7:
	    	           System.out.println("Please insert the new payment method ");
	    	           String h= input.nextLine();
	    	           p.setPaymentMethod(h);
	    	           break;
	    	           
	    	       case 8:
	    	           System.out.println("Please insert the new diagnosis ");
	    	           String i= input.nextLine();
	    	           p.setDiagnosis(i);
	    	           break;
	    	       case 9:
	    	           System.out.println("Please insert the new prescription ");
	    	           String j= input.nextLine();
	    	           p.setPrescription(j);
	    	           break;
	    	           
	    	       case 10:
	    	           System.out.println("Please insert the new room ");
	    	           String k= input.nextLine();
	    	           p.setRoomNo(k);
	    	           break;

	    	   }
	    	}
	    	  
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
