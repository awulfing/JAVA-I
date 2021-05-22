/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

public class Ref
{
public static void main(String [] args)
{
Daffy quack = new Daffy("funny", 6);
Daffy webbed = new Daffy("silly");
Daffy beak = quack;

quack = quack.testQuestion(beak, webbed, new Daffy("tickly", 2));

System.out.println(quack.getFeature()); 		// Statement 4
System.out.println(webbed.getFeature()); 	// Statement 5
System.out.println(beak.getFeature()); 		// Statement 6
System.out.println(beak.num); 			// Statement 7
}
}