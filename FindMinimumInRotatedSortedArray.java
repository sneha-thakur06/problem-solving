FIND MINIMUM IN ROTATED SORTED ARRAY
====================================

BRUT FORCE APPROACH
====================

USING LINEAR SEARCH
---------------------
TIME COMPLEXITY=O(N)

=====================

public class Minimum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			ans=Math.min(ans,arr[i]);
			}
		System.out.println(ans);
	}

}


Optimal Approach
================

USING BINARY SEARCH
===================

TIME COMPLEXITY-O(LOG N)
========================

class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;

        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<nums[high]){
                ans=Math.min(nums[low],ans);
                break;
            }
            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            else{
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;

    }
}