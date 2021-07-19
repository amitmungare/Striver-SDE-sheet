package arrays;

public class MajorityElement1 {
	
public int majorityElement(int[] arr) {
        
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
		// TODO Auto-generated method stub

	}

}
