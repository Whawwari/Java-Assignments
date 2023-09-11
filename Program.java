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
public class Program {

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        int sum = 0;
        Node current = node1;
        while (current != null) {
            int data = current.getData();
            sum += data;
            current = current.getNext();
        }
        System.out.println("Sum: " + sum);
    }

}
