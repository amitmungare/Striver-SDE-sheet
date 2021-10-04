package recursion;

import java.util.*;

public class PermutationSequence {
	
	public String getPermutation(int n, int k) {
        int f=1;
        List<Integer> num = new ArrayList<>();
        for(int i=1; i<n;i++){
            f*=i;
            num.add(i);
        }
        num.add(n);
        String op="";
        k--;
        while(true){
            op+=num.get(k/f);
            num.remove(k/f);
            if(num.size()==0)break;
            
            k%=f;
            f/=num.size();
        }
        return op;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
