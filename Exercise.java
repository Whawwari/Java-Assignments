/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engg1420_w23;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
//import java.sql.Date;
//import java.util.*;



/**
 *
 * @author fattanezarrinkalam
 */
public class Exercise {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c = new Circle(10);
        //c.setR(10);
        c.y = 20;
        
        System.out.println(c.area());

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
        
        Date currdate = new Date();
        System.out.println("Current Date: " + currdate);
        
        
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
        
       
        
//Write a Java program to compare two numbers.
        /*
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare       
        int number2; // second number to compare  

        System.out.print("Input first integer: "); // prompt        
        number1 = input.nextInt(); // read first number from user   

        System.out.print("Input second integer: "); // prompt        
        number2 = input.nextInt(); // read second number from user               

        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
            //System.out.printf("%d == %d\n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != %d\n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d\n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }
         */
        // Write a Java program to convert a binary number to a decimal number.
        /*
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            //decimalNumber += remainder * j;

            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    
         */
        //Use the weekday number to calculate the weekday name:
        /*
        Scanner input = new Scanner(System.in);
        int day;
        System.out.print("Input day number: "); //         
        day = input.nextInt(); // read the number from user 

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong number");

        }
         */
        //change the previous code and get the day until the user enters a valid day
        /*
        int day;
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Input day number: "); //         
            day = input.nextInt(); // read the number from user 
        }while(day<1 || day >7);
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
         */
        //Write a Java program and compute the sum of the digits of an integer.
        /*
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Input the number: "); //         
        number = input.nextInt();
        
        int n = number; 
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("sum is : " + sum);
         */
        //Write a Java program to display the system time.
        /*
        long time = System.currentTimeMillis();
        System.out.println("Current Date time:" + time);

        System.out.printf("Current Date time: %tc%n", time);
         */
    }
}
