package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulYear {
	public static int findnextDistinctyear(int year)
	{
		while(true)
		{
			year++;
			if(isDigitsDistinct(year)==true)
			{
				return year;
			}
		}
		
	}
	public static boolean isDigitsDistinct(int year)
	{
		HashMap<Integer,Integer> hmp=new HashMap<>();
	
		while(year>0)
		{
			int d=year%10;
			hmp.put(d, hmp.getOrDefault(d, 0)+1);
			year=year/10;
		}
		for(Map.Entry<Integer, Integer> entry:hmp.entrySet())
		{
			if(entry.getValue()>1)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int nextyear=findnextDistinctyear(year);
		System.out.println("Next Distinct year "+nextyear);
		

	}

}
