package test;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int r;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		
		if(temp==sum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
