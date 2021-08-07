package test;

import java.util.Scanner;

public class SplitArray {

	public static boolean check(int arr[]) {
	   return split(arr, 0, arr.length-1,0,0);
	}
	
	public static boolean split(int arr[], int s, int e, int ls, int rs) {
		
		if(s>e) {
			if(ls==rs)return true;
			else return false;
		}
		
		if(arr[s]%5==0) {
			return split(arr,s+1, e, ls+arr[s],rs);
		}else if(arr[s]%3==0) {
			return split(arr,s+1, e, ls,rs+arr[s]);
		}else {
			return split(arr,s+1, e, ls+arr[s],rs) || split(arr,s+1, e, ls,rs+arr[s]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(check(arr));
		
	}

}
