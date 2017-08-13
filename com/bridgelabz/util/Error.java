/*********************************************************************************
*compalition: javac -d bin DayOfWeek.java
*execution: java -cp bin com.bridgelabz.util.DayOfWeek n
*  purpose: To determine the error in the program .
*
* @author Keerthana Reddy
* @version 1.0
* @since 11-08-2017
**********************************************************************************
/*
 *import statements
 */
package com.bridgelabz.util;
public class Error{
/* 
 *main method is not present there would be a run time error
 */ 
 public static void display(String args[]){
System.out.println("hello");
}
}