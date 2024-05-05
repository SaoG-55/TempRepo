package dsa;

import java.util.Scanner;

public class BorzeTernary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		StringBuilder ans=new StringBuilder();
		//0-> . 1-> -. 2-> --
		
		
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='.')
			{
				ans.append("0");
			}
			else if(n.charAt(i)=='-')
			{
				if(n.charAt(i+1)=='.')
				{
					ans.append("1");
					i++;
				}
				else
				{
					if(n.charAt(i+1)=='-')
					ans.append("2");
					i++;
					
				}
			}
			
		}
		System.out.println(new String (ans));
		
	}

}
