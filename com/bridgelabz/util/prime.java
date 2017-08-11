/*********************************************************************************
*compalition: javac -d bin Prime.java
*execution: java -cp bin com.bridgelabz.util.Prime n
*  purpose: To determine wheather the number is prime or not.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;



import java.util.Scanner;
 public class Prime{
   public static void main(String args[]){		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	//capture the input in an integer
	int num=scan.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}