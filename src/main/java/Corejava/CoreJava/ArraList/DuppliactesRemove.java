package Corejava.CoreJava.ArraList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuppliactesRemove {

	public static void main(String[] args) {
		
		List<String> f = new ArrayList<String>();
		{
			f.add("Mumbai");f.add("Hyderabad");f.add("Khammam");f.add("Delhi");
		}
		List<String> s = new ArrayList<String>();
		          s.add("Mumbai");s.add("Khammam");s.add("Chennai");
		          
		   f.addAll(s);
		   System.out.println(f);
		  Set<String> set = new HashSet<String>(f);
		     set.addAll(s);
		   System.out.println(set);  
		   List<String> nf = new ArrayList<String>(set);
		          System.out.println(nf); 
		          
	List<String> listone = new ArrayList<String>();
	listone.add("Nagraj");listone.add("Raja");listone.add("mahesh");
	List<String>  listTwo = new ArrayList<String>();
	    listTwo.add("Shaivalini");listTwo.add("Nagraj");listTwo.add("Supriya");
	    
	    List<String> listTwoCopy = new ArrayList<String>(listTwo);
	        System.out.println(listTwoCopy);
	        listTwoCopy.removeAll(listone);
	        System.out.println(listTwoCopy);
	        listone.addAll(listTwoCopy);
	        System.out.println(listone);
		          
     
	}

}
