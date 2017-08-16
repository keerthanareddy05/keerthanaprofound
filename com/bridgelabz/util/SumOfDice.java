/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util SumOfDice.java
*execution: java -cp bin com.bridgelabz.util.SumOfDice n
* purpose: To determine the number is second largest and which number is second smallest.
*
* @author Keerthana Reddy
* @version 1.0
* @since 11-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util; 
public class SumOfDice {
   
    /*  This program simulates rolling a pair of dice.
        The number that comes up on each die is output,
        followed by the total of the two dice.
    */
 
    public static void main(String[] args) {
    
        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

    }  // end main()
 
}  // end class
