/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import week6.Person;

/**
 *
 * @author fattanezarrinkalam
 */
public class Employee extends Person{
    private int empcode;

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public int getEmpcode() {
        return empcode;
    }

    @Override
    public String getDayOffInformation() {
        return "3 sick days";
    }
    
    
    
}
