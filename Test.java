/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Arrays;

/**
 *
 * @author fattanezarrinkalam
 */
public class Test {

    int parameter;

    public void changeValue(int input) {
        parameter = input;
        input++; 
    }

    

    public void changeValue_by_reference(Point point) {
        point.x++;
        point.y++;
    }
    
    public void changeValue_object(Point point) {
        //point = new Point();
        point.x++;
        point.y++;
    }

    public void print(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    
    public void changeValue_array(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i]++;
        }
    }

    public static void main(String args[]) {
        /*
        int par = 10;
        Test test = new Test();
        
        System.out.println(par);
        
        test.changeValue(par);
        
        System.out.println(par);
        */ 
 /*
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        
        Test test = new Test();
        
        System.out.println(p.x + " " + p.y);
        test.changeValue_object(p);

        //test.changeValue_by_reference(p);
        System.out.println(p.x + " " + p.y);
      */   
 
        int[] numbers = {10, 20, 30, 40};
        Test test = new Test();
        System.out.println(Arrays.toString(numbers));
        //test.print(numbers);
        test.changeValue_array(numbers);
        System.out.println(Arrays.toString(numbers));

        //test.print(numbers);



    }
}
