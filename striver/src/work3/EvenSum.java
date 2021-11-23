package work3;

import java.util.*;

public class EvenSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		
		int a=0; 
		int b=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)a++;
			else b++;
		}
		if(b%2==0)System.out.println(a);
		else System.out.println(b);
		
	}

}
