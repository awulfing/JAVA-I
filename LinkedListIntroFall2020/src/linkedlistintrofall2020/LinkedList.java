/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistintrofall2020;

/**
 * 4
 *
 * @author Hunter
 */
public class LinkedList {

    private Node first;
    private int count;

    public LinkedList() {
        first = null;
    }

    public void deleteList() {
        first = null;
    }

    public void add(int x) {

        Node temp = new Node(x);
        count = count + 1;

        if (count == 1) {
            temp.setLast(true);
        } else if (count > 1) {
            temp.setLast(false);
        }

        temp.setNext(first);

        if (first != null) {
            first.setPrev(first);
            first.getPrev().setFirst(false);
        }

        first = temp;
        first.setFirst(true);

        fixIt();
    }

    private Node getLast() {
        Node temp = first;
        if (temp.getLast() == false) {
            while (true) {
                if (temp.getLast() == true) {
                    return temp;
                }
                temp = temp.getNext();

            }
        }
        return temp;
    }

    private void fixIt() {
        first.setPrev(getLast());
        Node temp = getLast();
        temp.setNext(first);
    }

    public void print() {
        Node temp = first;

        for (int x = 0; x < count; x++) {
            System.out.println();
            System.out.println(temp.getData());
            temp.print();
            temp = temp.getNext();
        }
        

    }

    public void printBackwards() {
        Node temp = getLast();

        for (int x = count; x > 0 ; x--) {
            System.out.println();
            System.out.println(temp.getData());
            temp.print();
            temp = temp.getPrev();
        }
        

    }

    public void search(int index) {
        Node temp = first;

        while (temp != null) {
            if (temp.getData() == index) {
                System.out.println("Found " + index);
                return;
            }
            temp = temp.getNext();
        }

        System.out.println("Didn't find " + index);

    }

    public void deleteNode(int x) {
        Node temp = first;

        if (temp == null) {
            return;
        }

        if (temp.getData() == x) {
            first.getNext().setPrev(null);
            first = temp.getNext();
            return;
        } else {
            //lagptr = first;
            temp = temp.getNext();
        }
        while (temp != null) {
            if (temp.getData() == x) {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                return;
            }
            //lagptr = temp;
            temp = temp.getNext();
        }

        System.out.println("Didn't find " + x);
    }
}
