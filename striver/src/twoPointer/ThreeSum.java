package twoPointer;

import java.util.*;

public class ThreeSum {
	
	 public List<List<Integer>> threeSum(int[] arr) {
	        
	        Arrays.sort(arr);
	        
	        List<List<Integer>> op = new LinkedList<>();
	        
	        for(int i=0; i<arr.length-2; i++){
	            
	            if(i==0 || (i>0 && arr[i-1] != arr[i])){
	                
	                int lo=i+1, hi=arr.length-1, sum=0-arr[i];
	                
	                while(lo<hi){
	                    if(arr[lo]+arr[hi] ==sum){
	                        op.add(Arrays.asList(arr[i], arr[lo], arr[hi] ));
	                        
	                        while(lo<hi && arr[lo+1] == arr[lo])lo++;
	                        while(lo<hi && arr[hi-1] == arr[hi])hi--;
	                        
	                        lo++;
	                        hi--;
	                        
	                    }
	                    else if(arr[lo]+arr[hi]<sum){
	                        lo++;
	                    }else{
	                        hi--;
	                    }
	                }                
	            }            
	        }
	        return op;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
