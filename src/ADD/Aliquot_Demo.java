package ADD;

import java.util.Scanner;

public class Aliquot_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n=1;
		int sum=0;
		
		
		
		for(int j=1;j<=100;j++)
			
		{
				
		   for (int i=1;i<=j;i++)	
		   {
			   
			  if (j%i == 0) 
			  {
				  
				  sum=sum+i;
			  }
		   }
		   
		   if( sum == j)
		   {
			   System.out.println(j + " is perfect number");
		   }
		   
		   
	}
		  
	}

}
