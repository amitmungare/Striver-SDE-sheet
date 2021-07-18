package arrays;

public class KadanesAlgorithm {
	
	 public int maxSubArray(int[] arr) {
	        
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
		
	}

}
