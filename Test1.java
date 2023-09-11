/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author fattanezarrinkalam
 */
public class Test1 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 0, 40, 50};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            int index = input.nextInt();
            int number1 = numbers[index];
            int number2 = 100 / number1;
            System.out.println("number2 is: " + number2);
        
      
       
        } catch (Exception er) {
            er.printStackTrace();

        }
    }

}
