/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util Gmabler.java
*execution: java -cp bin com.bridgelabz.util.DoubleOpt n
*  purpose: To determine the .
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;

public class Gambler { 

    public static void main(String[] args) {
/*
 * gambler's stating bankroll
 */
        int stake  = Integer.parseInt(args[0]); 
/*
 *gambler's desired bankroll
 */ 
        int goal   = Integer.parseInt(args[1]);
/*
 * number of trials to perform
 */   
        int trials = Integer.parseInt(args[2]); 
/*
 *total number of bets made
 */ 
        int bets = 0;  
/*
 *total number of games won
*/   
        int wins = 0;
/*        
 * repeat trials times
 */

      for (int t = 0; t < trials; t++) {
/*
 * do one gambler's ruin simulation
 */
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
/*
 * win $1
 */             
	  if (Math.random() < 0.5)
		 cash++;    
                else
/*
 * lose $1
 */             
               cash--;   
            }
/*
 * did gambler go achieve desired goal
 */
            if (cash == goal) wins++;               
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}