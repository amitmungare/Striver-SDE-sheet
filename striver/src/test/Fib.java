package test;

public class Fib {
	
	public static int fibo(int n) {
		
		if(n==2 || n==1)return 1;
		
		int a=fibo(n-1);
		int b=fibo(n-2);	
		
		int fib = a+b;
		
		return fib;
		
	}
	
	public static boolean sort(int arr[]) {
		
		return true;
		
	}

	public static void main(String[] args) {

//		System.out.print(fibo(7));
		
		int arr[] = {1,2,3,4,5};
		System.out.println(sort(arr));

	}

}
