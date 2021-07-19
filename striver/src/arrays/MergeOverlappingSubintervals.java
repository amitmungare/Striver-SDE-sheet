package arrays;

import java.util.*;

public class MergeOverlappingSubintervals {
	
	
	  public int[][] merge(int[][] inv) {
	        
//        Arrays.sort(inv, (a,b)-> Integer.compare(a[0],b[0]));
//        Stack<int[]> stack =new Stack<>();
//        stack.add(inv[0]);
       
//        for(int i=1; i<inv.length;i++){
           
//            int start2 = inv[i][0];
//            int end2 = inv[i][1];
           
//            int[] poparr = stack.pop();
           
//            int start1 = poparr[0];
//            int end1 = poparr[1];
           
//            int max = Math.max(end2,end1);
           
//            if(end1>=start2){
//                int merge[] = new int[]{start1,max};
//                stack.add(merge);
//            }else{
//                stack.add(poparr);
//                stack.add(inv[i]);
//            }
//        }
//        int[][] op =new int[stack.size()][2];
//        for(int i=op.length-1; i>=0;i--){
//            int[] poparr = stack.pop();
//            op[i][0]=poparr[0];
//            op[i][1]=poparr[1];
//        }
//        return op;
       
       
       
       
       List<int[]> op = new ArrayList<>();
       
       if(inv.length==0 || inv==null)return op.toArray(new int[0][]);
       
       Arrays.sort(inv, (a,b)-> a[0]-b[0]);
       
       int s = inv[0][0];
       int e = inv[0][1];
       
       for(int i=1; i<inv.length; i++){
           
           if(inv[i][0]>e){
               op.add(new int[]{s,e});
               s=inv[i][0];
               e=inv[i][1];
               
           }else if(inv[i][1] >= e){
               e = inv[i][1];
           }
                  
       }
       op.add(new int[]{s,e});
       return op.toArray(new int[0][]);
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
