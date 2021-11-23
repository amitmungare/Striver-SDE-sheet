package work;
import java.util.*;
public class RainbowArray {
	
	private static void check(int[] arr) {
		
		int si=0; 
		int ei=arr.length-1;
		boolean check=true;
		int curr=0;
		
		while(si!=ei && si<ei) {
			if(arr[si] != arr[ei]) {
				check=false;
			}
			if(arr[si]<1 || arr[si]>7) {
				check=false;
				break;
			}
			if(arr[si] != curr) {
				if(arr[si] != curr+1) {
					check=false;
					break;
				}else {
					curr=arr[si];
				}
			}
			si++;
			ei--;
		}
		
		if((arr[si]==7 ||curr==7) && check) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<13) {
			System.out.print("no");
			return;
		}
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		check(arr);

	}

	

}
