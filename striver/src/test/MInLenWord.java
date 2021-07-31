package test;

public class MInLenWord {
	
	static String minMaxLengthWords(String input)
    {
		int len = input.length();
        int si = 0, ei = 0;
        int l = len, s = 0;
 
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' '){
                ei++;
            }
            else{
                int curr = ei - si;
 
                if (curr < l){
                    l = curr;
                    s = si;
                }
                ei++;
                si = ei;
            }
        }
 
        return input.substring(s, s + l);
         
    }

	public static void main(String[] args) {
		
		String s="this is test string";
		System.out.println(minMaxLengthWords(s));
		
	}

}
