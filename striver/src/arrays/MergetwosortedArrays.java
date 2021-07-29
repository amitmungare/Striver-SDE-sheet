package arrays;

public class MergetwosortedArrays {

public void merge(int arr1[], int arr2[], int n, int m) {
        
        int arr[]= new int[n+m];
        int i=0, j=0, k=0;
        
        while(i<n && j<m){
            
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
               arr[k]=arr2[j];
                j++;
                k++; 
            }
        }
        
        while(i<n){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        
        while(j<m){
            arr[k]=arr2[j];
            j++;
            k++; 
        }
        
        int x=0;
        for(; x<n; x++){
            arr1[x] = arr[x];
        }
        for(int y=0; y<m; y++){
            arr2[y] = arr[x];
            x++;
        }
      
    }
	
public static void main(String[] args) {
		
	}
	
}
