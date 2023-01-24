package Xobin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 ArrayList<Integer> al= new ArrayList<>();
	      Scanner sc= new Scanner(System.in);
	      for(int i=0;i<10;i++)
	      {
	      	al.add(sc.nextInt());
	      }
	    
	    ArrayList<Integer> b= new ArrayList<>();
	    Iterator<Integer> itr=al.iterator();
	    
	      while(itr.hasNext())  
	      {
	        int d= itr.next();
	        if(b.contains(d))
	        {
	          itr.remove();
	        }
	        else
	        {
	          b.add(d);
	        }
	      }
	    Iterator<Integer>it=b.iterator();
	    while(it.hasNext())
	    {
	     System.out.print(it.next()+" ");
	    }
	       
	}

}
