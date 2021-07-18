package arrays;

import java.util.*;

public class InversionofArray {
	
	
	static long inversionCount(long arr[], long n)
    {
        /*long count =0;
        
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        
        return count;
        */
        
        return mergeSort(arr, 0 , arr.length-1);
    }
    
    private static long mergeSort(long arr[], int si, int ei){
        long count=0;
        
        if(si < ei){
            int mid = (si+ei)/2;
            count+=mergeSort(arr, si, mid);
            count+=mergeSort(arr, mid+1, ei);
            count+=merge(arr, si, mid ,ei);
        }
        
        return count;
    }
    
    private static long merge(long[] arr, int si,int mid, int ei){
        
        
        
        long left[] = Arrays.copyOfRange(arr, si, mid+1);
        long right[] = Arrays.copyOfRange(arr, mid+1, ei+1);
        
        int i=0, j=0, k=si;
        long count=0;
        
        
        while(i< left.length && j< right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                count +=(mid+1)-(si+i);
            }
        }
        
        while(i<left.length)
            arr[k++] = left[i++];
            
        while(j<right.length)
            arr[k++] = right[j++];
            
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
//	  // arr[]: Input Array
//    // N : Size of the Array arr[]
//    //Function to count inversions in the array.
//    static long inversionCount(long arr[], long N)
//    {
//        // Your Code Here
//        int n = (int)(N);
//        mergeSort(arr, 0, n-1);
//        return count;
//    }
//    
//    public static long[] mergeSort(long arr[], int lo, int hi){
//        if(lo==hi){
//            long ba[] = new long[1];
//            ba[0] = arr[lo];
//            return ba;
//        }
//        int mid = (lo+hi)/2;
//        
//        long []left = mergeSort(arr, lo, mid);
//        long []right = mergeSort(arr, mid+1, hi);
//        
//        long[] merged = merge2SortedArrays(left, right);
//        
//        return merged;
//    }
//    static long count = 0;
//    public static long[] merge2SortedArrays(long left[], long right[]){
//        int i=0;
//        int j=0;
//        int k=0;
//        
//        long[] merged = new long[left.length + right.length];
//        
//        while(i<left.length && j<right.length){
//            if(left[i] <= right[j]){
//                merged[k] = left[i];
//                i++;
//                k++;
//            }
//            else{
//                count += (left.length-i);
//                merged[k] = right[j];
//                k++;
//                j++;
//            }
//        }
//        
//       while(i<left.length){
//            merged[k] = left[i];
//                i++;
//                k++;
//       } 
//       while(j < right.length){
//           merged[k] = right[j];
//                k++;
//                j++;
//       }
//        return merged;
//    }
	
	
}
