/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util CarLoan.java
*execution: java -cp bin com.bridgelabz.util.CarLoan n
*  purpose: To determine the CarLoan
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import statements
 */
 package com.bridgelabz.util;
  public class CarLoan{
	public static void main(String args[]){
/*
 * the input is given by the user as principle,year,rate is accepted as args[0] args[1] args[2]and string is parsing to double 
 */
		double mPrinciple=Double.parseDouble(args[0]);
		double mYear=Double.parseDouble(args[1]);
		double mRate=Double.parseDouble(args[2]);
		double n,payment;
		double r=(mRate/(12*100));
		n=12*mYear;
		payment=(principle*r)/(1-Math.pow(1+r,(-n)));
		System.out.println("payment="+pay);
		
		}
}
		