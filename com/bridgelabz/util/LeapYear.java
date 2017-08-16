/*********************************************************************************
*compalition: javac -d bin  com/bridgelabz/util LeapYear.java
*execution: java -cp bin com.bridgelabz.LeapYear n
*  purpose: To determine wheather the year is leap year or not.
*
* @author keerthanareddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *
 *
 package com.bridgelabz.util;
*/ class is declared
   public class LeapYear{ 
	public static void main(String[] args){ 
/*	
 * the input is given by the user is accepted as args[0] and string is parsing to integer 
 */
	int year=Integer.parseInt(args[0]);
        /*
         *flag to store the test result
         */ 	
		boolean isLeapYear; 
	*			
	*/check wheatherYear is divisible by 4,
		isLeapYear =(year%4 == 0); 
	*/ if the year is in century check wheatherYear is divisible by 100 and 400,if divisible then it is leap year	 		 
		isLeapYear =isLeapYear && (year%100 == 0);
		isLeapYear =isLeapYear || (year%400 == 0);
	*/printing the output
			System.out.println(isLeapYear);   
		}
}
	*/end of program