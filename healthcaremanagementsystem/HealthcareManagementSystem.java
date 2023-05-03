/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.healthcaremanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Jumana
 */
public class HealthcareManagementSystem {

    public static void main(String[] args) {
        
       Admin.addDoctor("Dr. Maria","1234567890","987654321",10000,"California","Neurology", "Brain Surgery",10 );
       Admin.addDoctor("Dr. Steph","846436537","43735338363",11000,"Berlin","Pediatrics", "cardiology",10 );
       Admin.addDoctor("Dr. Hans","45676543","376438773663",9000,"Barcelona","Surgery", "urology",10 );
       
       Admin.addNormalPatient("female", "visa", "flu", "panadol", "Sarah", "234567654", "4575686476", 5000, "Seattle");
       Admin.addNormalPatient("female", "cash", "flu", "augmentin"," Debby", "15315121542", "2626541125", 4582, "Berlin");
       Admin.addNormalPatient("male", "visa", "cold", "adol", "Josh", "2515615615", "5512165152", 5465, "Cairo");
          
          
       Admin.addNurse("Aliyah","6346734643", "736747792683", 3500, "pediatrics", "cardiology", 4, "452A" );
       Admin.addNurse("John","345678", "42121541215121",4500 , "neurology", "brain surgery", 6, "256B" );
       Admin.addNurse("Ashton","8364836493", "94749374937", 4500, "surgery", "neurology", 7, "462B" );
            
       Admin.addEmergencyPatient("451A","female", "visa", "internal bleeding", "panadol", "Timmy", "789654", "45632145632", 5700, "Seattle");
       Admin.addEmergencyPatient("512B", "female", "cash", "concussion", "adol"," Kamal", "412596", "123654789", 4500, "Berlin");
       Admin.addEmergencyPatient("152A", "male", "visa", "covid-19", "panadol", "Harry", "369874", "4569821032", 5600, "Cairo");
          
          
        Admin.login();
        System.out.println("Enter the number of one of the options below"
                
        +"\n 1.Add Doctor"
        +"\n 2.Add Patient"
        +"\n 3.Add Nurse"
        +"\n 4.Edit existing Doctor"
        +"\n 5.Edit existing Patient"
        +"\n 6.Edit existing Nurse"
        +"\n 7.Delete Doctor"
        +"\n 8.Delete Patient"
        +"\n 9.Delete Nurse"
        +"\n 10. Display all Doctors"
        +"\n 11. Display Normal Patient"
        +"\n 12. Display Emergency Patient"
        +"\n 13. Display all Nurses"
        +"\n 14. Make appointment for Patient with Specific Doctor"
        +"\n 15. Add Emergency Patient"
        +"\n 16. Edit Emergency Patient"
        +"\n 17. Delete Emergency Patient");
        Scanner input= new Scanner (System.in);
        int x=input.nextInt();
       String a = input.nextLine();
        switch(x)
        {
            case 1:
                System.out.println("please insert name ");
                String name = input.nextLine();
                System.out.println("please insert national id");
                String nationalID = input.nextLine();
                System.out.println("please insert phone number");
                String phoneNumber = input.nextLine();
                System.out.println("please insert salary");
                int salary = input.nextInt();
                String aa = input.nextLine();
                System.out.println("please insert address");
                String address = input.nextLine();
                System.out.println("please insert department ");
                String department = input.nextLine();
                System.out.println("please insert specialization");
                String specialization = input.nextLine();
                System.out.println("please insert years of experience");
                int yearsOfExp = input.nextInt();
                String aaaa = input.nextLine();
                Admin.addDoctor( name,  nationalID,  phoneNumber,  salary,  address,  department,  specialization,  yearsOfExp );
                break;

               
            case 2:
                 System.out.println("please insert name ");
                String name1 = input.nextLine();
                System.out.println("please insert national id");
                String nationalid = input.nextLine();
                System.out.println("please insert phone number");
                String phoneno = input.nextLine();
                System.out.println("please insert salary");
                int salary1 = input.nextInt();
                String aaaaa = input.nextLine();
                System.out.println("please insert address");
                String address1 = input.nextLine();
                System.out.println("please insert gender ");
                String gender = input.nextLine();
                System.out.println("please insert payment method");
                String payment = input.nextLine();
                System.out.println("please insert years of diagnosis");
                String diagnosis = input.nextLine();
                System.out.println("please insert years of prescription");
                String prescription = input.nextLine();
                Admin.addNormalPatient(gender, payment, diagnosis, prescription, name1, nationalid, phoneno, salary1, address1);
                break;
            
            case 3:
                 System.out.println("please insert name ");
                String name3 = input.nextLine();
                System.out.println("please insert national id");
                String nationalid2 = input.nextLine();
                System.out.println("please insert phone number");
                String phoneno2 = input.nextLine();
                System.out.println("please insert salary");
                int salary3 = input.nextInt();
                String aaaaaa = input.nextLine();
                System.out.println("please insert address");
                String address3 = input.nextLine();
                System.out.println("please insert department ");
                String department2 = input.nextLine();
                System.out.println("please insert room");
                String room2 = input.nextLine();
                System.out.println("please insert years of experience");
                int yearsofexp11 = input.nextInt();
                String aaaaaaa = input.nextLine();
                Admin.addNurse(name3,nationalid2, phoneno2, salary3, address3, department2, yearsofexp11, room2 );
                break;
           
            case 4:
                 Admin.displayDoctors();
                 System.out.println("//////////////////////////////////");
                Admin.editDoctor(Hospital.doctorslist.get(0));
                 Admin.displayDoctors();
                break;
               
            case 5:
                Admin.displayNormalPatients();
                 System.out.println("//////////////////////////////////");
                Admin.editNormalPatient(Hospital.normalpatientslist.get(0));
                Admin.displayNormalPatients();
                break;
           
            case 6:
               Admin.displayNurses();
                 System.out.println("//////////////////////////////////");
                Admin.editNurse(Hospital.nurseslist.get(0));
                Admin.displayNurses();
                break;
               
            case 7:
                Admin.displayDoctors();
                System.out.println("//////////////////////////////////");
                System.out.println("please insert ID");
               String id = input.nextLine();
                Admin.deleteDoctor(id);
                Admin.displayDoctors();
                break;
               
            case 8:
                Admin.displayNormalPatients();
                System.out.println("//////////////////////////////////");
                System.out.println("please insert ID");
               String id1 = input.nextLine();
                Admin.deleteNormalPatient(id1);
                Admin.displayNormalPatients();
                break;
           
            case 9:
                Admin.displayNurses();
                System.out.println("//////////////////////////////////");
                 System.out.println("please insert ID");
               String id3 = input.nextLine();
                Admin.deleteNurse(id3);
                Admin.displayNurses();
                break;
               
            case 10:
                Admin.displayDoctors();
                break;
           
            case 11:
                Admin.displayNormalPatients();
                break;
               
            case 12:
                Admin.displayEmergencyPatients();
                break;
           
            case 13:
                Admin.displayNurses();
                break;
            
             case 14:
                 NormalPatient pp = new NormalPatient();
                Admin.setAppointment(pp);
                break;  
             case 15:
                  System.out.println("please insert name ");
                String name2 = input.nextLine();
                System.out.println("please insert national id");
                String nationalid1 = input.nextLine();
                System.out.println("please insert phone number");
                String phoneno1 = input.nextLine();
                System.out.println("please insert salary");
                int salary2 = input.nextInt();
                String aaaaaab = input.nextLine();
                
                
                System.out.println("please insert address");
                String address2 = input.nextLine();
                System.out.println("please insert gender ");
                String gender1 = input.nextLine();
                System.out.println("please insert payment method");
                String payment1 = input.nextLine();
                System.out.println("please insert years of diagnosis");
                String diagnosis1 = input.nextLine();
                System.out.println("please insert years of prescription");
                String prescription1 = input.nextLine();
                System.out.println("please insert years room number");
                String roomno = input.nextLine();
                Admin.addEmergencyPatient(roomno, gender1, payment1, diagnosis1, prescription1, name2, nationalid1, phoneno1, salary2, address2);
                break;
             case 16:
                 Admin.displayEmergencyPatients();
                 System.out.println("//////////////////////////////////");
                Admin.editEmergencyPatient(Hospital.emergencypatientslist.get(0));
                Admin.displayEmergencyPatients();
                break;
                
             case 17:
                 Admin.displayEmergencyPatients();
                 System.out.println("//////////////////////////////////");
                   System.out.println("please insert ID");
               String id2 = input.nextLine();
                Admin.deleteEmergencyPatient(id2);
                Admin.displayEmergencyPatients();
                break;
        }

}
}
