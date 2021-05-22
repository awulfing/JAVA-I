/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Adam
 */
public class Q1Reference
{
	public static void main(String [] args)
	{
	   Car tow = new Car( "Mater");
	   Garage radiatorSprings = new Garage(new Car("McQueen"));
	   Car lizzie = new Car();
	  
	   
	   System.out.println(tow.getName());       	//Print statement one
	   System.out.println(radiatorSprings.getName());      	//print statement two
	   System.out.println(lizzie.getName());	//print statement three
	   
 radiatorSprings.setCar(tow.testQuestion(radiatorSprings, new Garage(new Car("Sally")), lizzie));
	   
	   System.out.println(tow.getName());	//print statement ten
	   System.out.println(radiatorSprings.getName());	//print statement eleven
	   System.out.println(lizzie.getName());	//print statement twelve
	

    }
}

