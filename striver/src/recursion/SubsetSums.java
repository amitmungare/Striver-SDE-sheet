package recursion;
import java.util.*;
public class SubsetSums {
	
	 ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
	        
	        ArrayList<Integer> list =new ArrayList<Integer>();
	        fun(0, 0, arr, list);
	        Collections.sort(list);
	        return list;
	        
	    }
	    
	    void fun(int i, int sum, ArrayList<Integer> arr, ArrayList<Integer> list){
	        
	        if(i==arr.size()){
	            list.add(sum);
	            return;
	        }
	        
	        fun(i+1, sum+arr.get(i), arr, list);
	        fun(i+1, sum, arr, list);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
