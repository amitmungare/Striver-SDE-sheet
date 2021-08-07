package test;

import java.util.Scanner;

public class MinCount {

	public static int count(int n) {
		
		if(n<=3)return n;
		
		int temp=n;
		
		for(int i=1; i<=n;i++) {
			int r=i*i;
			if(r>n)break;
			else
				temp=Math.min(temp, count(n-r)+1);
		}
	
		return temp;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(count(n));
		
	}

}
