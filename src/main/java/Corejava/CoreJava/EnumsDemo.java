package Corejava.CoreJava;

public class EnumsDemo 
{
   public static void main(String args[])
   {
	   Course choice = Course.CSE;
	   switch(choice)
	   {
	   case CSE:
		   System.out.println("My dept is CSE ");

	   case ECE:
		   System.out.println("My dept ECE ");
	        
	   }
	   for(Course c : Course.values())
	   {
		   System.out.println(c);
	   }
   }
}
 enum Course
{
	CSE("cse"),ECE("ece");
	 private String value;

	 private Course(String value) {
			this.value = value;
		}
	 
	 
}