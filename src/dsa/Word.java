package dsa;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String str[]=s.split("//s+");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str);
		}

	}

}
