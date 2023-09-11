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
public class LinkedList {

    private int count;
    private Node firstNode;

    public LinkedList() {
        count = 0;
        firstNode = null;
    }

    public int length() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node current = firstNode;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        count++;
    }

    public boolean delete(int data) throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            boolean deleted = false;
            if (firstNode.getData() == data) {
                Node temp = firstNode;
                firstNode = firstNode.getNext();
                temp.setNext(null);
                deleted = true;
            } else {
                Node current = firstNode;
                while (current != null) {
                    if (current.getNext() != null && current.getData() == data) {
                        Node temp = current.getNext();
                        current.setNext(temp.getNext());
                        temp.setNext(null);
                        deleted = true;
                        break;
                    } else {
                        current = current.getNext();
                    }
                }
            }
            if (deleted) {
                count--;
            }
            return deleted;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = firstNode;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }
    }

    public String toString() {
        if (isEmpty()) {
            return null;
        } else {
            StringBuilder buffer = new StringBuilder();
            Node current = firstNode;
            while (current != null) {
                buffer.append(current.toString());
                current = current.getNext();
            }
            return buffer.toString();
        }
    }
}
