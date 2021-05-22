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
public class Commissioned extends Employee {

    private double commisionRate;
    private double grossSales;

    public Commissioned(String fname, String lname, double rate, double gross) {
        super(fname, lname);
        grossSales = gross;
        commisionRate = rate;
    }

    public Commissioned() {
        super();
        grossSales = 0;
        commisionRate = 0;
    }

    public String toString() {
        super.toString();
        System.out.println("commisionRate:" + commisionRate);
        System.out.println("grossSales:" + grossSales);
        return"";
    }
}
