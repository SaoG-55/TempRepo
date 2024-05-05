package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twosum {
	//optimal
	public  static int[] twosumprob(int arr[],int target)
	{
		Map<Integer,Integer> hmp=new HashMap<>();
		int flag=0;
		int ans[]=new int[2];
		for(int i=0;i<arr.length;i++)
			{
				int need=target-arr[i];
				if(hmp.containsKey(need))
				{
					ans[0]=hmp.get(need);
					ans[1]=i;
					flag=1;
					break;
				}
				else
				{
					hmp.put(arr[i], i);
				}
				
				
			}
		if(flag==1)
		{
			System.out.println(arr[0]+" "+arr[1]);
			return ans;
		}
		
		ans[0]=-1;
		ans[1]=-1;
		return ans ;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,7,11,5};
		int res[]=new int[2];
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("no.");	
//			int x=sc.nextInt();
//			arr[i]=x;
//		}
//		System.out.println("target");
		int target=9;
		res=twosumprob(arr,target);
		System.out.println("Index"+"[ "+res[0]+" "+res[1]+" ]");
		
			
	}

}
