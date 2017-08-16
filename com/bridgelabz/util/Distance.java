/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util Distance.java
*execution: java -cp bin com.bridgelabz.util.Distance n
*  purpose: To determine the Euclidean distance from point(x,y) .
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util;
public class Distance{
	public static void main(String args[]){
/*
 *parse method is taken because input is taken by main method string
 *the input is given by the user is accepted as args[0] and args[1] and string is parsing to integer 
 */
	int x= Integer.parseInt(args[0]);
	int y= Integer.parseInt(args[1]);
/*
 * distance formula is applied to find the distance
 */	
        double dist= Math.sqrt(x*x+y*y);
	   System.out.println("distance from("+x+","+y+") to(0,0)="+dist);
	}
}	