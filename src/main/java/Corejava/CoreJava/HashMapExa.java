package Corejava.CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExa 
{
	public static void main(String args[])
	{
		 int frequent=0;
           Map<Integer, Integer> m = new HashMap<Integer, Integer>();
                        m.put(1, 1);
                        m.put(2, 2);
                        m.put(3, 3);
                        m.put(4, 3);
                        m.put(5, 2);
                        m.put(6, 3);
                 System.out.println(m);
                 System.out.println("Value in Map:"+m.get(6));
                 System.out.println(m.entrySet());
                 System.out.println("values in map"+m.values());
                 Set<Entry<Integer, Integer>> entries = m.entrySet();
                            for(Entry<Integer, Integer> entry : entries)
                            {
                            	 
                            	 System.out.println(entry.getValue()+" is the value in Entry for key :"+entry.getKey());
                            	 if(entry.getKey().equals(6))
                            	 {
                            	 System.out.println(entry.setValue(100));
                            	 
                            	 }
                            
                            
                            }
                            
                            
                            for(Entry<Integer, Integer> entry :m.entrySet())
                            {
                            	if(entry.getKey()==entry.getValue())
                            	{
                            		frequent = frequent+1;
                            		
                            	}
                            	
                            }
                            System.out.println("frequent value:"+frequent);
	}      
	
}
