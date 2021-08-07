package test;

import java.util.Scanner;

public class TwoDarray {
	
	public static void print(int arr[][]) {
		int k=arr.length;
		for(int i=0;i<arr.length;i++) {
			
			int n=k;
			while(n>0) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				n--;
				System.out.println();
				
			}
			k--;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		print(arr);
		
		
	}

}
