package Corejava.CoreJava.ArrayListSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializationArraylist {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception 
    {
        ArrayList<String> namesList = new ArrayList<String>();
         
        namesList.add("alex");
        namesList.add("brian");
        namesList.add("charles");
        Collections.swap(namesList, 2,1);
        System.out.println(namesList);
 
        try
        {
            FileOutputStream fos = new FileOutputStream("ListData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(namesList);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
    
	
	
	ArrayList<Employee> emp = new ArrayList<Employee>();
	                 emp.add(new Employee("1","nag","Mumbai"));
	                 emp.add(new Employee("2","raj","Mumbai"));
	                 
	                 
	                 try
	                 {
	                     FileOutputStream fos = new FileOutputStream("employeeData");
	                     ObjectOutputStream oos = new ObjectOutputStream(fos);
	                     oos.writeObject(emp);
	                     oos.close();
	                     fos.close();
	                 } 
	                 catch (IOException ioe) 
	                 {
	                     ioe.printStackTrace();
	                 }
	
	                 
	                 
	                 
	                 try
	                 {
	                     FileInputStream fis = new FileInputStream("employeeData");
	                     ObjectInputStream ois = new ObjectInputStream(fis);
	          
	                     emp = (ArrayList) ois.readObject();
	          
	                     ois.close();
	                     fis.close();
	                 } 
	                 catch (IOException ioe) 
	                 {
	                     ioe.printStackTrace();
	                     return;
	                 } 
	                 catch (ClassNotFoundException c) 
	                 {
	                     System.out.println("Class not found");
	                     c.printStackTrace();
	                     return;
	                 }
	                  
	                 //Verify list data
	                 for (Employee employee : emp) {
	                     System.out.println(employee);
	                 }
    } 

}
 