package test;

public class FindLeadersinarray {

	public static void printLeaders(int arr[], int size)
    {
		int a[] =new int[arr.length];
		int k=0;
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) { 
                a[k] = arr[i];
                k++;
            }
        }
        for(int i=k-1; i>=0; i--) {
        	System.out.print(a[i]+" ");
        }
        
        
    }
 
    public static void main(String[] args)
    {
        
        int arr[] = new int[]{3 ,12 ,34, 2 ,0 ,-1};
//        int arr[] = new int[]{13, 17, 5, 4, 6};
        int n = arr.length;
        printLeaders(arr, n);
        
        
    }
	
}
