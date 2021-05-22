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
public class CommissionBase extends Commissioned {
    private double baseSalary;
    
    public CommissionBase(String fname, String lname, double rate, double gross,double base){
        super(fname, lname,rate, gross);
        baseSalary = base;
        
    }
    public CommissionBase(){
        super();
        baseSalary=0;
    }
    
    public String toString(){
        super.toString();
        System.out.println("baseSalary"+baseSalary);
        return "";
    }
}

