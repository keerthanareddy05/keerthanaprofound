/******************************************************************************
 *compalition: javac -d bin com/bridgelabz/util DayOfWeek.java
 *execution: java -cp bin com.bridgelabz.util.DayOfWeek n
 *  Purpose: Find out the factors for number
 * @author Keerthana Reddy
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 /*
 *import statements
 */
package com.bridgelabz.util;    
public class PrimeFactor
{
	public static void main(String args[])
	{
		
		int Number = Integer.parseInt(args[0]);
		System.out.println("Following are the factors of "+ Number);

		
		for(int i=1; i*i <= Number ;i++)
		{
			if(Number % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
