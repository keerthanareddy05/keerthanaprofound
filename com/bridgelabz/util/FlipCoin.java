 /*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util FlipCoin.java
*execution: java -cp bin com.bridgelabz.util.FlipCoin n
*  purpose: To determine wheather it is heads or tail.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import statements
/*
package com.bridgelabz.util; 
 public class FlipCoin{
	public static void main( String[]args){
/*
 *math.random() returns a value between 0.0 and 1.0
 * so it is heads or tails 50% of the time
*/	
	if(Math.random() < 0.5) System.out.println("heads"); 
	else     System.out.println("tails");
}
}