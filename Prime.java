import java.io.*;
public class Prime{
	public static void main(String args[]){
		int i,n,j, ctr=0;
		for(i=1;i<=10;i++)
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


