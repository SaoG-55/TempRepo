package dsa;

import java.util.Scanner;

public class BinarySearch_Iterative {
	
	private static int binarysrch(int[] arr, int target) 
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)return mid;
			else if(arr[mid]>target){high=mid-1;}
			else {low=mid+1;}
		}
		return -1;
	}


	public static void main(String[] args) 
	{
		// Iterative
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,4,6,7,9,12,16,17};
		System.out.println("Target?");
		int target=sc.nextInt();
		int index=binarysrch(arr,target);
		System.out.println(index);

	}

	
}
