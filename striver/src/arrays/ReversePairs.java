package arrays;

public class ReversePairs {
	
	public int reversePairs(int[] arr) {
        return mergeSort(arr, 0, arr.length-1, new int[arr.length]);
    }
    
    private int mergeSort(int arr[], int si, int ei, int a[]){
        if(si>=ei)return 0;
        
        int mid = si+((ei-si)>>1);
              
        return mergeSort(arr, si, mid, a)+mergeSort(arr, mid+1, ei, a)+merge(arr, si, ei, a);        
    }
    
      private int merge(int[] arr, int si, int ei, int[] a) {
          
         int mid  = si + ((ei-si) >> 1);
        int i = si, t = si, k = 0, res = 0;
          
        for(int j = mid + 1; j <= ei; j++) {
            
            while(t <= mid && arr[t] <= 2L * arr[j]) t++;
            res += mid - t + 1;
            
            while(i <= mid && arr[i] <= arr[j]) a[k++] = arr[i++];
            a[k++] = arr[j];
        }
          
        while(i <= mid) a[k++] = arr[i++];
          
        for(i = si; i <= ei; i++) arr[i] = a[i - si];
          
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
