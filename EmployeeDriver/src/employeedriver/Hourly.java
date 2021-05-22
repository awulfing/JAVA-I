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
public class Hourly extends Employee {

    private double wage;
    private int numberOfHours;

    public Hourly(String fname, String lname, double eWage, int hours) {
        super(fname, lname);
        wage = eWage;
        numberOfHours = hours;
    }
    
    public Hourly(){
        super();
        wage=0.0;
        numberOfHours=0;
    }

    public String toString() {
        super.toString();
        System.out.println("wage:" + wage);
        System.out.println("numberOfHours:" + numberOfHours);
        return "";
    }
}

