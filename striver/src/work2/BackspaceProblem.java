package work2;

public class BackspaceProblem {
	
	
	public static String backspace(String s){
        String str="";
        int i=s.length()-1;
        while(i>=0) {
        	int a=get(s,i);
        	str=s.charAt(a)+str;
        	i=a+1;
        }
        return str;
    }

	private static int get(String s, int i) {
		int count=0;
		while(i>=0) {
			if(s.charAt(i)=='#')count++;
			else if(count>0)count--;
			else break;
			
			i--;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
