/*********************************************************************************
*compalition: javac -d bin TemperatureConversion.java
*execution: java -cp bin com.bridgelabz.util.TemperatureConversion n
*  purpose: To convert the temperature from Farenhite to celcius.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util; 
import java.util.*;
public class TemperatureConversion{
 	public static void main(String args[]){	
/*	
 * the input is given by the user is accepted as args[0] and string is parsing to double
 */
          System.out.println("enter the temperature in farenhite:");
/*	
 * tc is initialised to zero and using formula to convert from farenhite to celcius 
 */
          double tc=0;
	   tc=((tf-32)/1.8);
	    System.out.println("the temperature in celcius is:" +tc);
	}
} 