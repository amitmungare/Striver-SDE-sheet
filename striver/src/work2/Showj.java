package work2;

import java.util.*;

public class Showj {
	
	public static void showJumpingNos(int x) {
		System.out.print("0 ");
        for(int i=1; i<=9 && i<=x; i++){
            bfs(x,i);
        }
	}

	private static void bfs(int x, int i) {
		Queue<Integer> q = new LinkedList<>();
		q.add(i);
		while(!q.isEmpty()) {
			i=q.remove();
			if(i<=x) {
				System.out.println(i+" ");
				int l=i%10;
				if(l==0) {
					q.add((i*10)+(l-1));
				}else if(l==9) {
					q.add((i*10)+(l-1));
				}else {
					q.add((i*10)+(l+1));
					q.add((i*10)+(l-1));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
