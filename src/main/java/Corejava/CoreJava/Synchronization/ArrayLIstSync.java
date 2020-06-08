package Corejava.CoreJava.Synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstSync {

	public static void main(String[] args) {
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		     names.add("nagraj");
		     names.add("mahesh");
		     names.add("kishore");
		     
		 synchronized(names) {
			   Iterator<String> itr = names.iterator();
			      while(itr.hasNext())
			      {
			    	  System.out.println(itr.next());
			      }
		 }
	}

}
