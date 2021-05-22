/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedriver;

/**
 *
 * @author Adam
 */
public class Employee {
    private String first;
    private String last;
    private String id;
    
    public Employee(String fname,String flast,String nid){
        first=fname;
        last=flast;
        id=nid;
    }
    public Employee(String fname,String flast){
        first=fname;
        last=flast;
        id="n/a";
    }
    
    public Employee(){
        first="n/a";
        last="n/a";
        id="n/a";
    }
    
    public String toString(){
        System.out.println("first:"+first);
        System.out.println("last:"+last);
        return"";
    }
}
