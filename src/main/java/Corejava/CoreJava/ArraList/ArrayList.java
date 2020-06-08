package Corejava.CoreJava.ArraList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ArrayList {

	public static void main(String[] args) {
		
		List<Integer> al = new java.util.ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,5,6,7,7,8,90));
		List<Integer> newal = new java.util.ArrayList<Integer>();
                  System.out.println(al);
                  al.add(345);
                  al.set(0, 34);
                 // System.out.println(al);
                  
                  Iterator< Integer> itr = al.iterator();
                  while(itr.hasNext())
                  {
                	  if(itr.next().equals(4))
                	  {
                		  al.set(0,itr.next());
                	  }
                  }
                  
                  DuppliactesRemove dr = new DuppliactesRemove();
		
		  for(int i= 0;i<al.size();i++) { 
			  if(al.get(i).equals(2)) 
				  al.set(i, 678);
		  
		  }
		 
                  System.out.println(al);
              al.stream().filter( i -> !i.equals(3)).forEach( i -> System.out.println(i));
              al.stream().filter(i -> !i.equals(5)).forEachOrdered(newal::add);
              System.out.println(newal);
              
              
              al.remove(4);
              al.remove("5");
              al.removeIf( i -> i.equals(3));
              System.out.println(al);
              
              
              
              List<String> list = new java.util.ArrayList<String>();
                       list.add("Nagraj");list.add("surya");list.add("arya");
                       int index = list.indexOf("Nagraj");
                       System.out.println(index);
                       System.out.println(list.set(list.indexOf("arya"),"Suryadevara"));
                       System.out.println(list);
              
	}

}
