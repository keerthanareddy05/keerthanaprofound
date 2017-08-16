/*********************************************************************************
*compalition: javac -d bin com/bridgelabz/util SpringSeason.java
*execution: java -cp bin com.bridgelabz.util.SpringSeason n
*  purpose: To determine wheather the season is spring or not.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************/
/*
 *import staements
*/
package com.bridgelabz.util;
public class SpringSeason{
public static void main(String args[]){
/*
 * the input is given by the user is month and day is accepted as args[0] and args[1],string is parsing to integer 
 */	
int mMonth=Integer.parseInt(args[0]);
int mday=Integer.parseInt(args[1]);
/*
 *boolean is used for checking the condyion given is true or false
 */
boolean isSpring=(mMonth==3&&mday>=20&&mday<=31)||(mMonth==4&&mday>=1&&mday<=30)||(mMonth==5&&mday>=1&&mday<=31)||(mMonth==6&&mday>=1&&mday<=20);
   System.out.println(isSpring);
}
}