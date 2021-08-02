package arrays;

public class KadanesAlgorithm {
	
	 public static int maxSubArray(int[] arr) {
	        
	        int sum=0;
	        int max=arr[0];
	        
	        for(int i=0; i<arr.length;i++){
	            sum+=arr[i];
	            if(sum>max)max=sum;
	            if(sum<0)sum=0;
	        }
	        return max;
	    }

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,3,2,2};
		int c = maxSubArray(arr);
		System.out.println(c);
	}

}
