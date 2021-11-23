package arrays;

public class RepeatandMissingNumber {
	
int[] findTwoElement(int arr[], int n) {
       
        
        
        int op[]=new int[2];
        
        for(int i=0; i<n; i++){
            int val = Math.abs(arr[i]);
            if(arr[val-1]>0){
                arr[val-1] = -arr[val-1];
            }else{
                op[0]=val;
            }
        }
        
        for(int i=0; i<n;i++){
            if(arr[i]>0){
                op[1]=i+1;
            }
        }
        
        return op;
    }
	

	public static void main(String[] args) {
		
	}

}
