/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util TwiceChecker.java
*execution: java -cp bin com.bridgelabz.util.TwiceChecker n
* purpose: To determine the number is repeated twice between 1 to 100.
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
public class TwiceChecker{
	public static void main(String args[]){
	int i,j;
/*
 *declaring an array
 */
	int a[]=new int[5];
	a[0]=3;
	a[1]=5;
        a[2]=2;
	a[3]=4;
	a[4]=5;
	a[5]=7;
	a[6]=8;
	a[7]=9;
	a[8]=1;
	a[9]=6;

		for(i=0;i<10;i++)
		{
		for(j=i+1;j<10;j++)
		{
		if(a[i]==a[j])
		{
			System.out.println(a[i]); 
			}
			
			}
			
}
}
}