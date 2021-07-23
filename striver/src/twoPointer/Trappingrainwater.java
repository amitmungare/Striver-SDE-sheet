package twoPointer;

public class Trappingrainwater {
	
	 public int trap(int[] hgh) {
	        
		    /*
		        int sum=0;
		        int l=0;
		        int r=0;
		        
		        for(int i=1; i<arr.length-1; i++){
		            l=arr[i];
		            for(int j=0; j<i; j++){
		                l=Math.max(l,arr[j]);
		            }
		            r=arr[i];
		            for(int j=i+1; j<arr.length;j++){
		                r=Math.max(r,arr[j]);
		            }
		            sum=sum + (Math.min(l,r)-arr[i]);
		        }
		        return sum;
		        */
		        
		        int sum = 0;
		        int left = 0, right = hgh.length-1;
		        int maxleft = 0, maxright = 0;
		        
		        while(left <= right){
		            
		            if(hgh[left] <= hgh[right]){
		                
		                if(hgh[left]>= maxleft)maxleft = hgh[left];
		                else sum+=maxleft- hgh[left];
		                left++;
		            }else{
		                if(hgh[right] >= maxright)maxright = hgh[right];
		                else sum+=maxright - hgh[right];
		                right--;
		            }
		            
		        }
		        return sum;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
