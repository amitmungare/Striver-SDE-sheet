package work;

import java.util.Scanner;

public class GameOfDeath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(game(n,k));

	}

	private static int game(int n, int k) {
		if(n==1)return 1;
		
		return (game(n-1, k)+k-1)%n+1;
	}

}
