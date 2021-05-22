/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Adam
 */
public class Engineering {
    int length;
    int width;
    
    public Engineering(int length, int width) {
        this.length=length;
        this.width=width;
    }
    
    public Engineering(int radius) {
        length=radius;
        width=0;
    }
    
    public double circle() {
        return 3.14*length*length;
    }
    
    public int rect() {
        if(length*width==0){
            System.out.println("Error only one value");
        }
        return length*width;
    }
    
    public void changeLength(int newLength) {
        length = length + newLength;
    }
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        
        Engineering firstValues = new Engineering(6, 4); 
        Engineering secondValues = new Engineering(5);
        
        firstValues.changeLength(4);
        
        secondValues.changeLength(-5);
        
        double answer = firstValues.circle();
        int secondAnswer = firstValues.rect();
        int thirdAnswer = secondValues.rect();
        
        System.out.println(answer);
        System.out.println(secondAnswer);
        System.out.println(thirdAnswer);
         
    }
    
}
