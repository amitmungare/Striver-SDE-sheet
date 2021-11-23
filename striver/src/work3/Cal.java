package work3;

import java.util.*;

public class Cal {
	
	public static int eve(Stack<Object> s) {
		int r=0;
		if(!s.isEmpty())r=(int)s.pop();
		
		while(!s.empty() && !((char)s.peek()==')')) {
			char sign=(char) s.pop();
			
			if(sign=='+') {
				r+=(int)s.pop();
			}else {
				r-=(int)s.pop();
			}
		}
		return r;
	}
	
	public static int cal(String s) {
		int op=0;
		int n=0;
		Stack<Object> stack = new Stack<Object>();
		
		for(int i=s.length()-1; i>=0; i--) {
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch)) {
				op=(int)Math.pow(10, n)*(int)(ch-'0')+op;
				n+=1;
			}else if(ch != ' ') {
				if(n !=0) {
					stack.push(op);
					n=0;
					op=0;
				}
				if(ch=='(') {
					int r =eve(stack);
					stack.pop();
					stack.push(r);
				}else {
					stack.push(ch);
				}
			}
		}
		if(n!=0)stack.push(op);
		
		return eve(stack);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		System.out.println(cal(s));

	}

}
