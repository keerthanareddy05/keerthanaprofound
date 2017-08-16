/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util PowerOfTwo.java
*execution: java -cp bin com.bridgelabz.util.PowerOfTwo n
*  purpose: To determine the square of number 2.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;


public class PowerOfTwo{
 public static void main(String args[]){
//read in one command line argument
	int n=Integer.parseInt(args[0]);
	int i=0;
 	int power=1;
//repeat until i equals n
	 while(i<=n){
		System.out.println("2^"+i+"="+power); //print out the power of two 
		power=(power*2);	     //double to get the next
		i++;
		}
}
}