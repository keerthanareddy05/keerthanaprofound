
import java.io.*;
public class Prime{
	public static void main(String args[]){
	int isPrime=1; 
	int num=Integer.parseint(arg[0])
        System.out.println("entered number"+num);
	if(num==1||num==0)
			 System.out.println("entered number is not prime");


		for(i=1;i<=num;i++)
		{ 
			ctr=0;
			for(j=1;j<=10;j++){
				if(i%j==0){
					ctr++;
				}
			}
		}
        	if(ctr<=2){
			System.out.println("is prime");
		}
	}
}


