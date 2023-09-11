/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import week6.Person;
import week6.Student;

/**
 *
 * @author fattanezarrinkalam
 */
public class Teacher extends Person {

    private int rank;

    public Teacher(String name, String lastname, int rank) {
        setName(name);
        setLastname(lastname);
        setRank(rank);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public void print() {
        System.out.println("name: " + name);
        System.out.println("lastname: " + getLastname());
        System.out.println("rank: " + getRank());
        //System.out.println("birthdate" + birthDate);
        //System.out.println("address: " + address);
    }

    public static void main(String args[]) {
        //upcasting
        Person p = new Student("Ali", "Bahrami", 1);
        p.print();
        //downcasting
        if (p instanceof Student) {
            System.out.println(((Student) p).getId());
        }

        
        Person[] persons = new Person[2];
        
        //persons[0] = new Person("Samad", "lucy");
        persons[0] = new Student("Frank", "Taylor", 123);
        persons[1] = new Teacher("Fattane", "Zarrinkalam", 2);
        
        for(Person person: persons){
            person.print();
            System.out.println("*****");
            
   
        }
        
         
    }

    @Override
    public String getDayOffInformation() {
        return "4 sick days";
    }

}
