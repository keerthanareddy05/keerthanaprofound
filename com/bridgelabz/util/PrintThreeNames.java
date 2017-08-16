/*********************************************************************************
*compalition: javac -d bin  com/bridgelabz/util PrintThreeNames.java
*execution: java -cp bin com.bridgelabz.util.PrintThreeNames n
*purpose: To Print three names in reverse order. 
*@author keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *Import statements
 */
package com.bridgelabz.util; 
 import java.util.Scanner;

      public class PrintThreeNames{
	
	public static void main(String args[]){
/*
 * the input is given by the user as string
 */
		Scanner s=new Scanner (System.in);
		System.out.println("Enter three names:");
		String S1 = s.next();
		String S2 = s.next();
	        String S3 = s.next();
/*
 *string is printed in reverse order
 */
		System.out.println("Hi\t"+S3+"\t "+S2+"\t"+S1);
	}
}	
	