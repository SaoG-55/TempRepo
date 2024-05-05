package dsa;
import java.util.*;
import java.lang.*;


public class young_physicist69A 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Sumx=0,Sumy=0,Sumz=0;
		for(int i=0;i<n;i++)
			{
				int xi=sc.nextInt();
				int yi=sc.nextInt();
				int zi=sc.nextInt();
			
				Sumx +=xi;
				Sumy +=yi;
				Sumz +=zi;
			
			}
		if(Sumx==0 && Sumy==0 && Sumz==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
