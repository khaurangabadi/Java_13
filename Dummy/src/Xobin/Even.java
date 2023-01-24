package Xobin;

import java.util.ArrayList;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}
		//System.out.println(al.size());
		
		for(int i=0;i<10;i++)
		{
			if(al.get(i)%2!=0)
			{
				System.out.print(al.get(i)+" ");
			}
			
			
		}

	}

}
