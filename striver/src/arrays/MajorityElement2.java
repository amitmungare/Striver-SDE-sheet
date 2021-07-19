package arrays;
import java.util.*;

public class MajorityElement2 {
	
public List<Integer> majorityElement(int[] nums) {
        
        int n1=-1;
        int n2=-1;
        int c1=0;
        int c2=0;
        
        List<Integer> list = new ArrayList<>();
        if(nums.length==0)return list;
        
        for(int i:nums){
            
            if(n1==i){
                c1++;
            }else if(n2==i){
                c2++;
            }else if(c1==0){
                n1=i;
                c1=1;
            }else if(c2==0){
                n2=i;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        for(int i:nums){
            if(i==n1){
                c1++;
            }else if(i==n2){
                c2++;
            }
        }
        
        if((nums.length/3)<c1){
            list.add(n1);
        }
        if((nums.length/3)<c2){
            list.add(n2);
        }
        
        return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
