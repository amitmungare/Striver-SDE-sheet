package work2;

import java.util.*;
import java.util.Map;

public class CheckSubset {
	
	public static boolean check(int arr1[], int n1, int arr2[], int n2) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n2; i++) {
			if(!map.containsKey(arr2[i])) {
				map.put(arr2[i], i);
			}else {
				map.put(arr2[i], map.get(arr2[i])+1);
			}
		}
		
		for(int i=0; i<n1; i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])-1);
			}
		}
		
		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			if(itr.next().getValue()>0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		

	}

}
