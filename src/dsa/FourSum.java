package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum 
{
	public static List<List<Integer>> foursumprob(int nums[],int target)
	{
		//optimal;
		Set <List<Integer>> st=new HashSet<>();
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				HashSet<Integer>hset=new HashSet<>();
				for(int k=j+1;k<n;k++)
				{
					int need=target-(nums[i]+nums[j]+nums[k]);
					if(hset.contains(need))
					{
						List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],need);
						Collections.sort(temp);
						st.add(temp);
					}
					hset.add(nums[k]);
				}
				
			}
		}
		List<List<Integer>> ans=new ArrayList<>(st);
		return ans;
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,0,-1,0,-2,2};
		int target=0;
		List<List<Integer>> ans=new ArrayList<>();
		ans=foursumprob(arr,target);
		System.out.println(ans);

	}

}
