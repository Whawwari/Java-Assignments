/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fattanezarrinkalam
 */
public class Test2 {

    public static void main(String[] args) {
        method1();
        System.out.println("After method1");
    }

    public static void method1() {
        try {
            method2();
            System.out.println("After method2");
        } catch (InputMismatchException e) {
            System.out.println("Handling InputMismatchException in method1");
        }
    }

    public static void method2() {
        method3();
        System.out.println("After method3");
    }

    public static void method3() {
        int[] numbers = {10, 20, 30, 0, 40, 50};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            int index = input.nextInt();
            int number1 = numbers[index];
            int number2 = 100 / number1;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling ArrayIndexOutOfBoundsException in method3");
        }
    }
}

