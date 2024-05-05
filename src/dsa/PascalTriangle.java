package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	
	public static List<List<Integer>> PascalTriangle(int N)
	{
		List<List<Integer>> li=new ArrayList<>();
		for(int row=1;row<=N;row++)
		{
			List<Integer> temp=new ArrayList<>();
			int res=1;
			temp.add(res);
			for(int col=1;col<row;col++ )
			{
				res=res*(row-col);
				res=res/col;
				
				temp.add(res);
			}
			li.add(temp);
		}
		
		return li;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();//first N rows pascal triangle
		List<List<Integer>> li=new ArrayList<>();
		li=PascalTriangle(N);
		
		for(List<Integer> ele:li)
		{
			for(int i:ele)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		li.forEach(System.out::println);

	}

}
