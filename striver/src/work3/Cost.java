package work3;

import java.util.*;

public class Cost {
	
//	public static int[] get(Scanner sc) {
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			arr[i]=sc.nextInt();
//		}
//		return arr;
//	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Integer[] obj = new Integer[arr.length];
		
		for(int i=0; i<arr.length; i++)obj[i]=Integer.valueOf(arr[i]);
		
		Arrays.sort(obj, Collections.reverseOrder());
		
		int s=0;
		for(int i=0; i<obj.length; i++) {
			if(i%3==2)continue;
			
			s+=obj[i];
		}
		System.out.println(s);
	}

}
