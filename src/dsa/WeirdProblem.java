package dsa;
import java.util.Scanner;

public class WeirdProblem {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input no.");
		int n=sc.nextInt();
		
		int t=n;
		while(t>=1)
		{
			if(t%2==0)
			{
				System.out.print(t+" ");
				t=t/2;
			}
			else
			{
				System.out.print(t+" ");
				t=t*3+1;
			}
		}
		System.out.println();
	}

}
