package arrays;

public class Sort012 {
	
	private static int[] sort(int[] arr) {
		
		if(arr.length<=1)return arr;	
		int i=0, j=0;
		int k=arr.length-1;
		
		while(i<=k) {
			
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}
			else if(arr[i]==1) {
				i++;
			}else {
				if(i>k)continue;
				int temp = arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k--;
			}			
		}
		return arr;
	}

	public static void main(String[] args) {

		int a[]= {2,1,2,1,0,2,0,1,0,0,1};
		
		a = sort(a);

		for(int i: a) {
			System.out.print(i+" ");
		}
	}

	

}
