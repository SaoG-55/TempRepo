package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalElementRow 
{

	
	public static void main(String[] args) 
	{
		//optimal
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();//row whose elements are to be displayed
		
		List<Integer> temp=new ArrayList<>();
		temp.add(1);
		int res=1;
		for(int col=1;col<row;col++)
		{
			res=res*(row-col);
			res=res/col;
			
			temp.add(res);
			
		}
		
		for(int i:temp)
		{
			System.out.print(i+" ");
		}
		
	}

}
