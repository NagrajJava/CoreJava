package Corejava.CoreJava.Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListtoArray {

	public static void main(String[] args) {
		//ArrayList to Array
		List<String> al = new ArrayList<String>(Arrays.asList("Subba","Reddy","Mule"));
		String[] ar = al.toArray(new String[al.size()]);
		for(String a:ar)
		{
			System.out.println(a);
		}
		
		String[] a1 = al.stream().toArray(String[]::new);
		
		for(String a:a1)
		{
			System.out.println(a);
		}
		
		//Array to List
		
		List<String> nl = Arrays.asList(ar);
		//<String> nl1 = Lists.newArrayList(nl);
		System.out.println("new list elements:"+nl);
		
		//converting list to set
		
		Set<String> set = new HashSet<String>(nl);
		System.out.println(set);
	}

}
