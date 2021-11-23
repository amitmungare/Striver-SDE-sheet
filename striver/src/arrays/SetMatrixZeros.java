package arrays;

public class SetMatrixZeros {
	
	 public void setZeroes(int[][] arr) {
	        
	        int col1=1, row=arr.length, col2=arr[0].length;
	        
	        for(int i=0; i<row; i++){
	            if(arr[i][0]==0) col1=0;
	            for(int j=1; j<col2; j++)
	                if(arr[i][j]==0)
	                    arr[i][0]=arr[0][j]=0;
	            
	            
	        }
	        
	        for(int i=row-1; i>=0; i--){
	            for(int j=col2-1; j>=1; j--)
	                if(arr[i][0]==0 || arr[0][j]==0)
	                    arr[i][j]=0;
	            if(col1==0)arr[i][0]=0;
	        }  
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
