package arrays;

public class MajorityElement1 {
	
public static int majorityElement(int[] arr) {
        
        int count = 0;
        int ele =-1;
        
        for(int i=0; i<arr.length; i++){
            
            if(count==0){
                ele=arr[i];
            }
            
            if(arr[i] != ele){
                count++;
            }else{
                count--;
            }
            
        }
        return ele;
    }

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,3,2,2};
		int c = majorityElement(arr);
		System.out.println(c);
	}

}
