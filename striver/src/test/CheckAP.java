package test;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		
		int a[]= {2,6,10,15,19,23};
		System.out.print(checkAp(a));
		
	}

	private static boolean checkAp(int[] arr) {
		if(arr.length==1)return true;
		
		Arrays.sort(arr);
		
		int d =arr[1]-arr[0];
		for(int i=2;i<arr.length; i++) {
			if(arr[i]-arr[i-1] !=d)return false;
		}
		return true;
	}
	
	

}
