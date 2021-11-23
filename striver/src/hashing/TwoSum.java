package hashing;

import java.util.*;

public class TwoSum {
	
	  public int[] twoSum(int[] arr, int t) {
	        
		    /*HashMap<Integer,Integer> map = new HashMap<>();
		    int num = 0;
		    for(int i = 0; i < nums.length; i++)
		    {
		        if(map.containsKey(nums[i]))
		        {
		            int[] arr = {map.get(nums[i]), i};
		            return arr;
		        }
		        num = target - nums[i];
		        map.put(num, i);
		    }
		    return null;*/
		       
		        
		        int op[] = new int[2];
		        
		        HashMap<Integer,Integer> map  = new HashMap<>();
		        
		        for(int i=0; i<arr.length; i++){
		            
		            if(map.containsKey(t - arr[i] )){
		                op[0] = map.get(t - arr[i]);
		                op[1] = i;
		                    return op;
		            }
		            
		            map.put(arr[i],i);
		            
		        }
		        
		        return op;
		    }

	public static void main(String[] args) {
		
	}

}
