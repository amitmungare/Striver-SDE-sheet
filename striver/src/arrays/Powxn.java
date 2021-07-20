package arrays;

public class Powxn {
	
	public double myPow(double x, int n) {
	       
        /*if(n==0){
            return 1.0;
        }else if(n==1){
            return x;
        }else if(n==-1){
            return 1.0/x;
        }
        
        if(n%2==0){
            return myPow(x*x , n/2);
        }else{
            if(n<0){
                double p = myPow(x*x, (n+1)/2);
                return (1.0/x)*p;
            }else{
                double p = myPow(x*x, (n-1)/2);
                return x*p;
            }
        }*/
        
        
        double op = 1.0;
        long num=n;
        
        if(num<0)num= -1*num;
        
        while(num>0){
            if(num%2 ==1){
                op = op*x;
                num = num-1;
            }else{
                x*=x;
                num/=2;
            }
        }
        if(n<0)op = (double)(1.0)/ (double)(op);
        
        return op;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
