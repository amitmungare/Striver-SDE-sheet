package test;

public class Maximisethesum {

	
	
	public static int maxPathSum(int ar1[], int ar2[], int m, int n)
    {
        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;
 
        while (i < m && j < n)
        {
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
 
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
 
            else{
                result += Math.max(sum1, sum2) + ar1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
 
        while (i < m)
            sum1 += ar1[i++];
 
        while (j < n)
            sum2 += ar2[j++];
 
        result += Math.max(sum1, sum2);
 
        return result;
    }
 
    public static void main(String[] args){
        
        int ar1[] = {1, 5, 10, 15, 20, 25};
        int ar2[] = {2, 4, 5, 9, 15};
        int m = ar1.length;
        int n = ar2.length;
       
        System.out.println(maxPathSum(ar1, ar2, m, n));
    }

}
