FIND FIRST AND LAST POSITION IN SORTED ARRAY
=============================================

TIME COMPLEXITY-O(LOGN)
===========================

class Solution {
    public int lowerBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }

    public int upperBound(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,target);

        if(lb==-1){
            return new int[]{-1,-1};
        }
        int ub=upperBound(nums,target);
        return new int[]{lb,ub};
    }
}