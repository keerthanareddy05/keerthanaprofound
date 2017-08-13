/*********************************************************************************
*compalition: javac -d bin RandSeq.java
*execution: java -cp bin com.bridgelabz.util.RandSeq n
*  purpose: To determine the random sequence.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;

public class RandomSeq {

  public static void main(String args[]){
/*
 *string parsing into the integer
 */
    int inputNo=Integer.parseInt(args[0]); 
/*
 *looping is applied for generation of random sequence
 */

      for(int i=0;i<10;i++)
       
        {
           System.out.println(Math.random());
             
		}

  }
}