package test;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int num=n-j+1;
				if(num == i) {
					System.out.print("*");
				}else {
					System.out.print(num);
				}
			}
			System.out.println();
		}
		
	}

}
