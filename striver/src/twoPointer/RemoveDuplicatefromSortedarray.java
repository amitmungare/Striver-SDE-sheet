package twoPointer;

public class RemoveDuplicatefromSortedarray {
	
	 public int removeDuplicates(int[] arr) {
	       /* int i=0;
	        int j=1;
	        
	        while(j<arr.length){
	            if(arr[i]==arr[j]){
	                j++;
	            }else{
	                arr[i+1]=arr[j];
	                i++;
	                j++;
	            }
	        }
	        
	        return i+1;
	        */
	        
	        if(arr.length==0)return 0;
	        int j=0;
	        for(int i=0; i<arr.length; i++){            
	            if(arr[i] != arr[j]){
	                j++;
	                arr[j] = arr[i];
	                
	            }            
	        }
	        return j+1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
