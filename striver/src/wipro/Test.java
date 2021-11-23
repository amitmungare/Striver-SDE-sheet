package wipro;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		int arr[] = new int[day];
		
		for(int i=0; i<day; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		ArrayList op = find(day, s, e, arr);
		
		for (int i = 0; i < op.size(); i++) {
            System.out.print(op.get(i) + " ");
        }

	}
	
	public static ArrayList find(int day, int s, int e, int[] arr) {
		
		int op[] = new int[arr.length];
		
		ArrayList list = new ArrayList();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]< s || arr[i]>e) {
				list.add(arr[i]);
			}
			
		}	
		return list;
		
	}
	

}
