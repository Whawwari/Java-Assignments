/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import engg1420_w23.Circle;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
//import java.sql.Date;
//import java.util.*;



/**
 *
 * @author fattanezarrinkalam
 */
public class Exercise2 {

    public static void main(String[] args) {
        
        Circle c = new Circle(10);
        c.setR(10);
        System.out.println("the value of r is: " + c.getR());
       
        // TODO code application logic here

        //Write a Java program to get a number from user and generate a random number in that range
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        //System.out.println(number);
        
        
        Random random = new Random();
        int randomNumber = random.nextInt(number);
        System.out.println(randomNumber);
        */ 
        //Write a Java program to display the system date (use both packages 
        // java.sql.Date and java.util.Date)
        /*
        Date currdate = new Date();
        System.out.println("Current Date: " + currdate);
        
        
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
        
       */
        

    }
}
