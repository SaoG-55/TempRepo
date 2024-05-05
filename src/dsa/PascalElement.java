package dsa;

import java.util.Scanner;

public class PascalElement
{
	public static int nCr(int n,int r)
	{
		int res=1;
		for(int i=0;i<r;i++)//times thw loop will run
		{
			res = res * (n - i);
            res = res / (i + 1);
		}
		return res;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();//5
		int col=sc.nextInt();//3
		
		int ele=nCr(row-1,col-1);//n!/r!(n-r)! 4,2
		System.out.println("The ele at row "+row+" and col "+col+" is: "+ele);

	}

}
