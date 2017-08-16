/*********************************************************************************
*compalition: javac -d bin  com/bridgelabz/util DayOfWeek.java
*execution: java -cp bin com.bridgelabz.util.DayOfWeek n
*  purpose: To determine which day of week is given.
*
* @author Keerthana Reddy
* @version 1.0
* @since 08-08-2017
**********************************************************************************
/*
 *import statements
 */
public class DayOfWeek{
	public static void main(String args[]){
		int x,y1,m1,d1;
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		y1=y-(14-m)/12;
		x=y1+y1/4-y1/100+y1/400;
		m1=m+12*((14-m)/12)-2;
		d1=(d+x+(31*m1)/12)%7;
		//System.out.println("day of the week is " +d1);
		switch(d1){
			case 0:System.out.println("Day of the week is Sunday " );
			break;
			case 1:System.out.println("Day of the week is Monday " );
			break;
			case 2:System.out.println("Day of the week is Tuesday " );
			break;
			case 3:System.out.println("Day of the week is Wednesday" );
			break;
			case 4:System.out.println("Day of the week is Thursday " );
			break;
			case 5:System.out.println("Day of the week is Friday " );
			break;
			case 6:System.out.println("Day of the week is Saturday " );
			break;
		}

			      
	}
}	
		
		