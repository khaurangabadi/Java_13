package Xobin;

public class Recursive {
	
	int rec(int num)
	{
		if(num==1)
		{
	
		return 1;
	}
	else
	{
		
		
		int res=num*rec(num-1);
		return res;
	}
		
	}

	public static void main(String[] args) {
		Recursive r=new Recursive();
	System.out.println(	r.rec(5));

	}

}
