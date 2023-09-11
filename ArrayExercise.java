/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

//import java.util.Arrays;

import java.util.Arrays;

/**
 *
 * @author fattanezarrinkalam
 */
public class ArrayExercise {

    public static void main(String[] args) {

        //Write a Java program to sum values of an array  
        /*
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        
        for (int i = 0; i < my_array.length; i++){
            //sum += my_array[i];
            System.out.println(my_array[i]);
            sum = sum + my_array[i];
        }
         
        for (int e : my_array) {
            System.out.println(e);
            sum += e;
        }

        System.out.println("The sum is " + sum);
*/
        //Write a Java program to find the index of an array element

        /*
        int[] my_array = {25, 14, 56, 15, 25, 56, 77, 18, 29, 49};
        int t = 2;
        
        int i = 0;
        while (i < my_array.length) {
            if (my_array[i] == t) {
                System.out.println("Index position of " + t + " is: " + i);
                
            }
            i = i + 1;
        }
        
        boolean flag = false;
        for(int i = 0; i<my_array.length; i++){
            if (my_array[i] == t) {
                System.out.println("Index position of " + t + " is: " + i);
                flag = true;
                
            }
        }
        
        if(!flag){
            System.out.println("it is not included");
        }
        
        
        int i = 0;
        for(int element:my_array){
            if (element == t) {
                System.out.println("Index position of " + t + " is: " + i);
                
            }
            i++;
        }
        */
        
        
        //Write a Java program to remove a specific element from an array
        
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int removeIndex = 1;
        
        System.out.println("Original Array : " + Arrays.toString(my_array));

        // Remove the second element (index->1, value->14) of the array
        

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
         
    }
}
