package test;

import java.util.Scanner;

public class NumStarPattern {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i,j,k;
		  for(i=n;i>=1;i--){
		    for(j=1;j<=n;j++)
		    {
		      if(j<=i)
		        System.out.print(j);
		      else
		    	  System.out.print("*");
		    }
		    for(j=n;j>=1;j--)
		    {
		      if(j<=i)
		    	  System.out.print(j);
		      else
		    	  System.out.print("*");
		    } 
		    System.out.println();
		    
		  }
	}
}
