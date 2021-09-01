package arrays;

import java.util.*;

public class PascalTriangle {
	
public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        List<Integer> row  = null;
        List<Integer> prv  = null;
        
        for(int i=0; i<numRows; i++){
            row = new ArrayList<Integer>();
            
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prv.get(j-1) + prv.get(j));
                }
            }
            prv = row;
            op.add(row);
            
        }        
        return op;        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
