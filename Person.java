/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Date;

/**
 *
 * @author fattanezarrinkalam
 */
public abstract class Person {

    protected String name;
    private String lastname;
    public Date birthDate;
    String address;

    public Person(String name, String lastname) {
        setName(name);
        setLastname(lastname);
    }

    public Person() {
    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("lastname: " + lastname);
    }

    public Person(String name, String lastname, Date birthDate) {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    
    /*
    public String getDayOffInformation(){
        return null;
    }
    */
    
    public abstract String getDayOffInformation();
}
