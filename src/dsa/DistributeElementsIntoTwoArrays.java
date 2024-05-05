package dsa;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] resultArray(int[] nums) 
    {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        for(int i=2;i<nums.length;i++) 
        {
            if(a1.get(a1.size()-1)>a2.get(a2.size()-1))
            {
                a1.add(nums[i]);
            }
            else
            {
                a2.add(nums[i]);
            }
        }
        int i=0;
        for(int x:a1)
        {
            nums[i++]=x;
            
        }  
         for(int y:a2)
        {
            nums[i++]=y;
            
        }  
        return nums;
    }
}

public class DistributeElementsIntoTwoArrays 
{
	

	public static void main(String[] args) 
	{
		Solution obj=new Solution();
		int arr[]= {5,4,3,8};
		int arr2[]=obj.resultArray(arr);
		for(int x:arr2)
		{
			System.out.print(x+" ");
		}
		
		

	}

}
