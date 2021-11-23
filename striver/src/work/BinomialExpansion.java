package work;

import java.util.*;

public class BinomialExpansion {
	
	private static void BinomialExpression(int a, int x, int n) {
		
		int t = (int)Math.pow(a, n);
		System.out.print(t+" ");
		
		for(int i=1; i<=n; i++) {
			t=t*x*(n-i+1)/(i*a);
			System.out.print(t+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int x = sc.nextInt();
		int n = sc.nextInt();

		BinomialExpression(a, x, n);
		
		
	}

	

}
