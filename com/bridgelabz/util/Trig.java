 /*********************************************************************************
*compalition: javac -d bin Binary.java
*execution: java -cp bin com.bridgelabz.util.Binary n
* purpose: To convert the decimal to binary numbr.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util; 
public class Trig{
 public static void main(String args[]){
/*
 * degree and radian through command line
 */

  	 double degree=Double.parseDouble(args[0]);
  	 double radian=Double.parseDouble(args[1]);

/*
 * caluclate sin, cos, and tan
 */

  	double s=Math.sin(radian);
   	System.out.println("sin("+degree+")="+s);

   
   	double c=Math.cos(radian);
   	System.out.println("cos("+degree+")="+c);

   	double t=Math.tan(radian);
   	System.out.println("tan("+degree+")="+t);

   
  	double r=s*s+c*c;
   	System.out.println(s*s+"+"+c*c+"="+r);
  	}
 }