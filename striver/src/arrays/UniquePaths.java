package arrays;

public class UniquePaths {
	
	public int uniquePaths(int m, int n) {
//      int dp[][] =new int [m][n];
     
//      for(int i=0; i<dp.length;i++){
//          dp[i][0]=1;
//      }
//      for(int i=0; i<dp[0].length;i++){
//          dp[0][i]=1;
//      }
     
//      for(int i=1; i<dp.length;i++){
//          for(int j=1; j<dp[0].length;j++){
//              dp[i][j] = dp[i-1][j] + dp[i][j-1];
//          }
//      }
//      return dp[m-1][n-1];
     
     
     int num=n+m-2;
     int r = m-1;
     double res=1;
     
     for(int i=1; i<=r; i++){
         res = res*(num-r+i)/i;
     }
     return (int)res;
     
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
