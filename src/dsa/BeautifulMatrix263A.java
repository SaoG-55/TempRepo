package dsa;
import java.util.Scanner;

public class BeautifulMatrix263A 
{

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		int row=5,col=5,cnt=0;
		int a[][]=new int[5][5];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]==1)
				{
					a[i][j]=0;
					a[2][2]=1;
					cnt=Math.abs(2-i)+Math.abs(2-j);
					
				}
			}
		}
		System.out.println(cnt);
		
	}

}
