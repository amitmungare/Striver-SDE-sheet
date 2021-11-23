package work3;
import java.util.*;
public class Sieve {

	public static void sieve(int n, boolean check[]) {
		check[0]=false;
		check[1]=false;
		
		for(int i=2; i<=n; i++)check[i]=true;
		
		for(int j=2; j*j<=n; j++) {
			if(check[j]==true) {
				for(int i=j*2; i<=n; i+=j)check[i]=false;
			}
		}
	}
	
	public static void superp(int n) {
		boolean check[]=new boolean[n+1];
		sieve(n,check);
		
		int prime[] =new int[n+1];
		int j=0;
		
		for(int i=2; i<=n; i++) {
			if(check[i]) {
				prime[j++] = i;
			}
		}
		
		for(int i=0; i<j; i++) {
			if(check[i+1]) {
				System.out.println(prime[i]+" ");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		superp(n);

	}

}
