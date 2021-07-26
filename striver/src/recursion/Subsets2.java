package recursion;
import java.util.*;
public class Subsets2 {
	
	 public void subset(int ind, int[] nums, List<Integer> ds, List<List<Integer>> list){
	        list.add(new ArrayList<>(ds));
	        for(int i=ind; i<nums.length; i++){
	            if(i!=ind && nums[i]==nums[i-1])continue;
	            ds.add(nums[i]);
	            subset(i+1,nums, ds, list);
	            ds.remove(ds.size()-1);
	        }
	    }
	    
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        
	        Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<>();
	        subset(0, nums, new ArrayList<>(), list);
	        return list;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
