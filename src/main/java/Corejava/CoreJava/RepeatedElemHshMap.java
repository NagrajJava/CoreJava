package Corejava.CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedElemHshMap {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,1,2,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int n = a.length;
		System.out.println(CountRepeatedElmnts(a,n));
	}

	private static int CountRepeatedElmnts(int[] a, int n) {
		 Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		     for(int i=0;i<n;i++)
		     {
		    	 int key = a[i];
		    	 if(m.containsKey(key))
		    	 {
		    		 int rep = m.get(key);
		    		   rep++;
		    		 m.put(key, rep);
		    	 }
		    	 else
		    	 {
		    		 m.put(key, 1);
		    	 }
		     }
		     System.out.println(m);
		     int maxval =0;int repval=0;
		     for(Entry<Integer, Integer> entry : m.entrySet())
		     {
		    	
		    	
				if(maxval  < entry.getValue())
				{
					repval = entry.getKey();
					maxval = entry.getValue();
				}
		     }
		
		
		     return repval;
		
	}
	

}
