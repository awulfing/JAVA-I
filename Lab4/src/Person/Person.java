/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/************************************************************
     Person  class
*************************************************************/

public class Person{
  private String myName;
  
  public Person(String name)
  {
      myName = name;
  }
  
  public Person()
  {
  }
   
  public String getName()
  {
     return myName; 
  }
  
  public void setName(String name)
  {
     myName = name;
  }

  public Person changeName(Person person1, Person person2, int a)
  {
      a = 7;
      person1 = person2;
      person2.setName("Six");
      System.out.println(person1.getName());    //1
      System.out.println(person2.getName());    //2
      System.out.println(a);                    //3
      person2 = new Person("five");
      System.out.println(person1.getName());    //4
      System.out.println(person2.getName());    //5
      person1.setName("Four");
      System.out.println(person1.getName());    //6
      System.out.println(person2.getName());    //7
      person2.setName("Eight");
      return person1;
  }
  
      public static void main(String [] args)
    {
        Person pOne = new Person("First");
        Person pTwo = new Person("Second");
        int a = 5;
        pOne = pTwo.changeName(pTwo, pOne, a);
        System.out.println(pOne.getName());     //8
        System.out.println(a);                  //9
        System.out.println( pTwo.getName());    //10
       
    }
  
}
