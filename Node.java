/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/**
 *
 * @author fattanezarrinkalam
 */
public class Node {
    private int data;
    private Node next;
    
    
    public Node() {
        this(0);
    }

    public Node(int data) {
        setData(data);
        setNext(null);
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
    
    public String toString() {
        return String.format("[%d]", data);
    }
}