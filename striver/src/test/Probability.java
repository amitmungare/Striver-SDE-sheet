package test;

public class Probability {
	
	public static int fact(int number) {
		int ans=1;
		for(int i=1;i<number;i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static int ncr(int num, int r) {
		int ans=(fact(num)/fact(num-r))/fact(r);
		return ans;
	}
	
	public static int probability(int n, int x) {
		int ans=ncr(4,x)*ncr(4,n-x);
		float probab=ans*1.0f/ncr(8,n);
		return (int)(probab*100);
	}

	public static void main(String[] args) {
		
		
		
	}

}
