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
public class LinkedListIntroFall2020 {

   //delete a node
    //delete the whole list
    // make double linked list
    //
    
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
      // ll.print();
       System.out.println("adding");
       ll.add(5);
       ll.add(7);
       
       ll.add(9);
       ll.add(10);
       ll.print();
      // ll.printBackwards();
       ll.search(7);
       ll.search(99);
       ll.deleteNode(9);
       ll.print();
       
    }
    
}

