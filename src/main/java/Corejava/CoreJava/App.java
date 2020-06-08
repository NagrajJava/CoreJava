package Corejava.CoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        List<Employee>  emp = new ArrayList<Employee>();
           emp.add(new Employee("Nag","Raj"));
           emp.add(new Employee("Subba","Rao"));
           emp.add(new Employee("Ramu","Rao"));
           emp.add(new Employee("Somu","Rao"));
           emp.add(new Employee("Beemu","Rao"));
           
           List<Integer> numbers = new ArrayList<Integer>();
               numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);
           Map<Integer,  Object[]> map = new TreeMap<Integer, Object[]>();
           List<Object> newlist = new ArrayList<Object>(numbers);
           newlist.addAll(emp);
                       System.out.println(newlist);
           for(int i =0; i<newlist.size();i++)
           {
           map.put(i, new Object[]{newlist.get(i)});
                System.out.println(map.size());
           Object[] objarr = map.get(i);
                  
                 for(Object ar : objarr)
                  System.out.println("values in the map"+ar);
                 
                 
                 
           }   
           
         }
    
    
}

 class Employee
{
	String name;
	String lastname;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String lastname) {
				this.name = name;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return   name + lastname;
	}
	
	
	
}