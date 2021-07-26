package recursion;
import java.util.*;
public class PalindromePartitioning {
	
	 public List<List<String>> partition(String s) {
	        List<List<String>> op = new ArrayList<>();
	        List<String> path = new ArrayList<>();
	        combo(0, s, path, op);
	        return op;
	    }
	    
	    public void combo(int ind, String s, List<String> path, List<List<String>> op){
	       
	        if(ind ==s.length()){
	            op.add(new ArrayList<>(path));
	            return;
	        }
	        
	        for(int i=ind; i<s.length(); i++){
	            if(pal(ind, i, s)){
	                path.add(s.substring(ind, i+1));
	                combo(i+1, s, path, op);
	                path.remove(path.size()-1);
	            }
	        }
	        
	    }
	    
	    public boolean pal(int si, int ei, String s){
	        while(si<=ei){
	            if(s.charAt(si++) != s.charAt(ei--))return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
