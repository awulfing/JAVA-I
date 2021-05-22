/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistintrofall2020;

/**
 *
 * @author Hunter
 */
public class Node {
    private int data;
    private Node next;
    private Node prev;
    private boolean isFirst;
    private boolean isLast;
    
    public Node(int d){ 
        data = d;
    }
    
    public void setLast(boolean set){
        isLast=set;
    }
    
    public void setFirst(boolean set){
        isFirst=set;
    }
    
    public boolean getLast(){
        return isLast;
    }
    
    public boolean getFirst(){
        return isFirst;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node temp) {
        next = temp;
    }
    
    public Node getPrev(){
        return prev;
    }
    
    public void setPrev(Node temp) { 
        prev = temp;
    }
    
    public int getData(){
        return data;
    }
    
    public void print(){
        System.out.println("Next:     "+next.getData());
        System.out.println("Previous: "+prev.getData());
    }
}

