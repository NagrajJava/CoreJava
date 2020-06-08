package Corejava.CoreJava.ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compare2Lists {

	public static void main(String[] args) {
		List<String> listone = new ArrayList<String>(Arrays.asList("nagraj","Ramu","Badra","Mahesh"));
		List<String> listTwo = new ArrayList<String>(Arrays.asList("Kishore","Ramu","Mahesh"));
		
					Collections.sort(listone);
					Collections.sort(listTwo);
					
			boolean isequal = listone.equals(listTwo);
			     System.out.println(isequal);
			        listone.removeAll(listTwo);
			        System.out.println(listone);
			        listone.retainAll(listTwo);//matched element in list
			     System.out.println(listone);
			     
			     
			     
		  List<String> newone = new ArrayList<String>(listone);
		       //System.out.println(newone);
		         newone.addAll(listTwo);
		         newone.removeAll(listone);
		         System.out.println(newone);

	}

}
