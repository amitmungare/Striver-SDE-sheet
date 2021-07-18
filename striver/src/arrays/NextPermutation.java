package arrays;

public class NextPermutation {
	
	
	 public void nextPermutation(int[] a) {
	        
	        if(a==null || a.length <= 1)return;         
	        int i=a.length-2;
	        
	        while(i>=0 && a[i]>=a[i+1])i--;
	        
	        if(i>=0){
	            int j=a.length-1;
	            while(a[j] <= a[i])j--;
	            swap(a, i, j);        
	        }        
	        reverse(a, i+1, a.length-1); 
	        
	    }    
	    private void swap(int arr[],int i, int j){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	    }    
	    private void reverse(int arr[], int i, int j){
	        while(i<j) swap(arr, i++,j--);
	    }

	public static void main(String[] args) {
		
	}

}
