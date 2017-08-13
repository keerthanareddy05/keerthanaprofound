/*********************************************************************************
*compalition: javac -d bin Sqrt.java
*execution: java -cp bin com.bridgelabz.util.Sqrt n
*  purpose: To determine the square root of a number.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;


public class Sqrt { 
    public static void main(String[] args) { 
/*
 *read in the command-line argument
 */
         
        double c = Double.parseDouble(args[0]);
/*
 * relative error tolerance
 * estimate of the square root of c
 */

        double epsilon = 1e-15;   
        double t = c;             
/*
 * repeatedly apply Newton update step until desired precision is achieved
 */ 
      while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }

}