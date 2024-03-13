/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Practical3 {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Please enter your name");
       String fname = scan.nextLine();
       System.out.println("Your name is" + fname);
       
       System.out.println("Please enter your monthly salary");
       Double mSalary = scan.nextDouble();
       System.out.println("How much are you left with?");
       Double curBalance = scan.nextDouble();
       
       Double availBalance = mSalary - curBalance;
       System.out.println("You have used R" + availBalance + "this far");
        
        
        
        
        
        
    }
}
