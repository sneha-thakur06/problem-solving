SEARCH ROTATED SORTED ARRAY
===========================

BRUT FORCE APPROACH
-----------------------
TIME COMPLEXITY-O(N)


public class SearchInRotatedArray{
	
	public static int searchInRotatedArray(int[] arr, int x){
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] == x){
				
				return i;
				
				}
	
		}
		return -1;	
			
	}

}



OPTIMAL APPROACH
================

TIME COMPLEXITY-O(LOGN)
-----------------------

USING BINARY SEARCH
-------------------------


class Solution {
    public int search(int[] nums, int target) {
    int low=0;
    int high=nums.length-1;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(nums[mid]==target){
            return mid;
        }
         if(nums[low]<=nums[mid]){
               if(nums[low]<=target && nums[mid]>target){
                    high=mid-1;
               }
        else{
            low=mid+1;
        }
        }

        else{
            if(nums[mid]< target && target<=nums[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }

    return -1;
    }
}

