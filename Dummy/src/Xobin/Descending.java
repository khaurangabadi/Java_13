package Xobin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Descending {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			al.add(sc.next());
		}
		
		TreeSet<String> ts=new TreeSet(new Comparator<String>()
				{

					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);
					}

					
			
		});
		
		ts.addAll(al);
		System.out.println(ts);
		

	}

}
