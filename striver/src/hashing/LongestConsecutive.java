package hashing;

import java.util.*;

public class LongestConsecutive {
	
	 public int longestConsecutive(int[] arr) {
	        
	       /* if(arr.length==0){
	            return 0;
	        }
	        
	        Arrays.sort(arr);
	        
	        int max = 1;
	        int count=1;
	        
	        for(int i=1; i<arr.length; i++){
	            if(arr[i] != arr[i-1]){
	                if(arr[i]== arr[i-1]+1){
	                    count++;
	                }else{
	                    max = Math.max(max,count);
	                    count=1;
	                }
	            }         
	        }
	        return Math.max(max,count);
	        */
	        
	        
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i:arr)set.add(i);
	        
	        int count=0;
	        
	        for(int i: arr){
	            if(!set.contains(i-1)){
	                int num = i;
	                int c=1;
	                
	                while(set.contains(num+1)){
	                    num++;
	                    c++;
	                }
	                count = Math.max(count, c);
	            }
	        }
	        return count;       
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
