package arrays;

public class Searchina2Dmatrix {

	 public static int matSearch(int mat[][], int n, int m, int x){
	        
	        int i=0;
	        int j=m-1;
	        
	        while(i>=0 && i<n && j>=0 && j<m){
	            
	            if(mat[i][j]==x){
	                return 1;
	            }else if(x<mat[i][j]){
	                j--;
	            }else{
	                i++;
	            }
	            
	        }
	        return 0;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
