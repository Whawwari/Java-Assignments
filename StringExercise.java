/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author fattanezarrinkalam
 */
public class StringExercise {

    public static void main(String[] args) {

// Java Program to count the total number of characters in a string
        /*
        String str = "Object_Oriented_Programming";    
        int count = 0;    
        System.out.println(str.length());   
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != '_')    
                count++;
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);   
         */
// Java Program to count the total number of digits in a string
/*        
String string = "O7bject O5riente5d Progra5mmi9ng";
        int count = 0;

        //Counts each digit   
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        System.out.println("Total number of digits in a string: " + count);
         */
//Java Program to divide a string in 'N' equal parts.
        /*
        String str = "aaaabbbbcccc";
        int n = 5;


        //Stores the length of the string  
        int len = str.length();
        //n determines the variable that divide the string in 'n' equal parts  
        int chars = len / n;

        //Check whether a string can be divided into n equal parts  
        if (len % n != 0) {
            System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
        } else {
            for (int i = 0; i < len; i = i + chars) {
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i + chars);
                System.out.println(part);
            }

        }
         */
        //Java Program to replace lower-case characters with upper-case and vice-versa
        /*
        String str1 = "Great Power";
        StringBuffer newStr = new StringBuffer(str1);

        for (int i = 0; i < str1.length(); i++) {

            //Checks for lower case character    
            if (Character.isLowerCase(str1.charAt(i))) {
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            } //Checks for upper case character    
            else if (Character.isUpperCase(str1.charAt(i))) {
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
         */
    }
}
