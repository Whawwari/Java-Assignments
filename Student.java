/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author fattanezarrinkalam
 */
public class Student extends Person {

    private int id;

    public Student(String name, String lastname, int id) {
        setName(name);
        setLastname(lastname);
        //this.name = name;
        ///this.lastname = lastname;
        //super(name, lastname);
        setId(id);
    }
    @Override
    public String toString(){
        return "the name of the student is " + this.name ;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public void print() {
        super.print();
        //System.out.println("name: " + name);
        //System.out.println("lastname: " + getLastname());
        System.out.println("id: " + getId());
        //System.out.println("address " + address);
    }
    
    @Override
    public String getDayOffInformation(){
        return "2 sick days";
    }
    
  
    
    
    
    public static void main(String args[]) {
        Student s = new Student("Ali", "Bahrami", 1234);
        //System.out.println(s);
        s.getDayOffInformation();
    }
    
}
