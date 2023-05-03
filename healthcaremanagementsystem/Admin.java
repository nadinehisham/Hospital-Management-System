/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Jumana
 */
public class Admin extends Hospital {
    private static String username;
    private static String password;
    public Admin(){
        
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Admin.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Admin.password = password;
    }
    
    public static void login(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your username");
        username= input.nextLine();
        setUsername(username);
        
        System.out.println("Please insert your password");
        password= input.nextLine();
        setPassword(password);
        
      if (username.equals("admin") && password.equals("admin")){
         
          System.out.println("Login successful");
      }
      else{
          System.out.println("IncorrectUsername or Password");
          System.exit(1);
          
      }  
    }
}
