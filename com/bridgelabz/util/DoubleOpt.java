/*********************************************************************************
*compalition: javac -d bin DoubleOpt.java
*execution: java -cp bin com.bridgelabz.util.DoubleOpt n
*  purpose: To determine the precedence of the operators.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;

class DoubleOpt {

     public static void main(String[] args) {
   double input1=Double.parseDouble(args[0]);
   double input2=Double.parseDouble(args[1]);
   double input3=Double.parseDouble(args[2]);
/*
 *first the multiplication is performed and then addition is done due to precedence.
 */ 
        double result1 = (input1 + input2 * input3);
/*
 *now multiplication is performed and then addition is performed.
 */
         double result2 = (input1 * input2 + input3);
/*
 *now division is performed and the addition is performed.
 */
          double result3 = (input1 % input2 + input3);
/*
 *for dislpaying the output of the results.
 */ 

    System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

     System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
      System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

