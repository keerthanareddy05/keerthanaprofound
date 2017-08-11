/*********************************************************************************
*compalition: javac -d bin IntOpt.java
*execution: java -cp bin com.bridgelabz.IntOpt n
*  purpose: To determine the precedence of the operators.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import staements
*/
package com.bridgelabz.util;

class IntOpt {

     public static void main(String[] args) {
    int input1=Integer.parseInt(args[0]);
    int input2=Integer.parseInt(args[1]);
    int input3=Integer.parseInt(args[2]);
 
       double result1 = (input1 + input2 * input3);

       double result2 = (input1 * input2 + input3);

        double result3 = (input1 % input2 + input3); 

          System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

          System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
          System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

