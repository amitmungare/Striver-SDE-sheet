package arrays;

public class DuplicateInAnArray {
	
	 public int findDuplicate(int[] arr) {
	        
	        // Arrays.sort(arr);
	        // for(int i=0; i<arr.length; i++){
	        //     if(arr[i]==arr[i+1]){
	        //         return arr[i];
	        //     }
	        // }
	        // return -1;
	        
	        
	         for(int i=0; i<arr.length; i++){
	            
	             int val = Math.abs(arr[i]);
	            
	             if(arr[val]>0){
	                 arr[val]= -arr[val];
	             }else{
	                 return val;
	             }
	            
	         }
	        return 0; 
	        
//	        int a[] = new int[arr.length];
//	        
//	        for(int i=0; i<arr.length; i++){
//	            a[arr[i]]++;
//	        }
//	        
//	        for(int i=0; i<arr.length; i++){
//	            if(a[i]==2){
//	                return i;
//	            }
//	        }
//	        return 0;
	        
	    }

	public static void main(String[] args) {
		
	}

}
