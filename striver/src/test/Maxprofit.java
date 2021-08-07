package test;

import java.util.Arrays;
import java.util.Scanner;

public class Maxprofit {
	
	public static int profit(int arr[],int n) {
		
		Arrays.sort(arr);
		
		int a[] = new int[n];
		
		for(int i=0; i<n;i++) {
			a[i] = (n-i)*arr[i];
		}
		
		int m = Integer.MIN_VALUE;
		
		for(int i:a) {
			if(m<i)m=i;
		}
		return m;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}				
		System.out.println(profit(arr,n));
		
	}

}
