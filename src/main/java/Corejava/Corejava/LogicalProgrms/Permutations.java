package Corejava.Corejava.LogicalProgrms;

import java.util.Random;
import java.util.Scanner;

public class Permutations 
{
   public static void main(String args[])
   {
	   System.out.println("Enter Length");
	   Scanner s =  new Scanner(System.in);
	        int n = s.nextInt();
	      Random r = new Random();
	      int[] sequence = new int[n];
	     
		for(int i =0 ; i<n ;i++)
			sequence[i] = Math.abs(r.nextInt(10));
		for(int i =0 ;i<n ; i++)
			
			{
			System.out.println("Orignal Numbers:"+sequence[i]);
			}
		System.out.println("\nPermutation Seques are:");
	       permutations(sequence,0);
		s.close();
		
	        
   }

private static void permutations(int[] a, int k) {
	
	if(k == a.length)
		{
			for(int i = 0; i<a.length ; i++)
			{
				System.out.print("[" + a[i] + "]");
				
			}
			System.out.println();
		
        }
	else
	{
	    for(int i =k ;i< a.length;i++)
	    {
	    	int temp = a[k];
	    	   a[k]=a[i];
	    	   a[i]=temp;
	    	   
	    	   permutations(a,k+1);
	    	   
	    	   temp = a[k];
	    	   a[k]=a[i];
	    	   a[i]=temp;
	    }
	}
	
}
}
