package arrays;

public class StockBuyandSell {
	
	
	public int maxProfit(int[] arr) {
        
        int min =arr[0];
        int profit = 0;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]<min){
                min=arr[i];
            }
            else if (arr[i]-min > profit){
                profit = arr[i]-min;
            }
        }
         return profit;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
