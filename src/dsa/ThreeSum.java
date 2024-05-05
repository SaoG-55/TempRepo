package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum
{
	public static List<List<Integer>> threesumprob(int nums[],int target)
	{
		
		Set <List<Integer>> st=new HashSet<>();
		//optimal
		for(int i=0;i<nums.length;i++)
		{
			Set<Integer> hset=new HashSet<>();
			for(int j=i+1;j<nums.length;j++)
			{
				int need=target-(nums[i]+nums[j]);
				if(hset.contains(need))
				{
					List<Integer> temp=Arrays.asList(nums[i],nums[j],need);
					Collections.sort(temp);
					st.add(temp);
					
				}
				hset.add(nums[j]);
				
			}
		}
		List<List<Integer>> ans=new ArrayList<>(st);
		return ans;
	}
	public static void main(String[] args) 
	{
		int arr[]= {-1,0,1,2,-1,-4};
		int target=0;
		List<List<Integer>> numlist=new ArrayList<>();
		numlist=threesumprob(arr,target);
		System.out.println(numlist);
		
	}

}
