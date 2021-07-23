package twoPointer;

public class Maxconsecutiveones {
	
	public int findMaxConsecutiveOnes(int[] arr) {       
        int count=0;
        int max=0;
        
        for(int i=0; i<arr.length; i++){
           if(arr[i]!=1){
               count=0;
           }else{
              count++; 
           }
           if(count>max)max =count;
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
