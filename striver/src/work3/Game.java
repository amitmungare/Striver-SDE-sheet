package work3;
import java.util.*;
public class Game {
	

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int op=0;
		while(y>x) {
			op++;
			if(y%2==1)y++;
			else y/=2;
		}
				
		System.out.println(op+x-y);
	}

}
