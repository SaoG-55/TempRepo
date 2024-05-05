package dsa;
import java.util.*;
public class Queue_At_The_School 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		String s=sc.next();
		
		char queue[]=s.toCharArray();
		
		for(int x=0;x<t;x++)
		{
			for(int i=0;i<n-1;i++)//not comparing last ele
			{
				if(queue[i]=='B'&& queue[i+1]=='G')
				{
					char temp=queue[i];
					queue[i]=queue[i+1];
					queue[i+1]=temp;
					i++;//skipping next position
					
				}
			}
		}
		System.out.println(new String(queue));
	}
}
