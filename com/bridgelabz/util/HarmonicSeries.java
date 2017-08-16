/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Harmonic n
 *  Purpose:      Print  harmonic series upto n entered by user
 *  @author  keerthana Reddy
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************
/*
 *import statements
 */
 package com.bridgelabz.util;

 public class Harmonic{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int i;
		for(i=1;i<=num;i++){
			//System.out.println();
			System.out.print("1/"+i);
			if(i<num){
				System.out.print("  +  ");
			}
		}
		
	}
}
