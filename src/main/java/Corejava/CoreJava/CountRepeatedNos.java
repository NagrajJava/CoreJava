package Corejava.CoreJava;

public class CountRepeatedNos
{
	

	public static void main(String args[])
	{
    int[] a = {1,2,3,1};
    int n = a.length;
    System.out.println(countRepeatedNum(a,n));
	}

	private static int countRepeatedNum(int[] a, int n) {
            int count = 0,max_count=0;
            int rep=a[0];
		   for(int i = 1;i<n-1;i++)
		   {
			   //checking repeated element
			  if(a[i]==a[i-1])
			   {
				  count= count+1;
				   rep = a[i];
			   }else 
	            { 	                 
					if (count > max_count) 
	                { 
	                    max_count = count; 
	                    rep = a[i - 1]; 
	                } 
	                count = 0; 
	            } 
		   }
		   if (count > max_count) 
	        { 
	            max_count = count; 
	            rep = a[n - 1]; 
	        } 
	      
		   
		return rep;
	}
    
}
