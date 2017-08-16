/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util Sin.java
*execution: java -cp bin com.bridgelabz.util.Sin n
* purpose: To convert t.
*
* @author Keerthana Reddy
* @version 1.0
* @since 11-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util;    
import java.util.*;
public class Sin{

    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);
	double term=0;
/*
 *convert x to an angle between -2 PI and 2 PI
 */
        x = x % (2 * Math.PI);
/*
 *compute the Taylor series approximation
 *ith term = x^i / i!
       double term = 1.0; 
/*
 *sum of first i terms in taylor series
 */     
        double sum  = 0.0;      

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}