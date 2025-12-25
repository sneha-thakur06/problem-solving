MAXIMUM COUNT OF POSITIVE AND NEGATIVE INTEGER
==============================================
BRUT FORCE APPROACH 
---------------------

TIME COMPLEXITY-O(N)
SPACE COMPLEXITY-O(1)
======================

class Solution {
    public int maximumCount(int[] nums) {
       
         int pos=0;
         int neg=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
             continue;
         }
         if(nums[i]>0){
             pos++;
         }
         else{
             neg++;
         }
        } 
       
         return Math.max(pos,neg);
   }
}



OPTIMAL APPROACH USING BINARY SEARCH ALGORITHM
===============================================
TIME COMPLEXITY-O(logn)
SPACE COMPLEXITY-O(1)
============================

class Solution {
    public int maximumCount(int[] nums) {
       
    int n=nums.length;
        int lb=lowerBound(nums,0);
        int ub=upperBound(nums,0);

        return Math.max(lb,n-ub);

    }

    private int lowerBound(int[] nums, int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return left;
    }



        private int upperBound(int[] nums, int target){
            int left=0;
            int right=nums.length;
            while(left<right){
                int mid=left+(right-left)/2;
                if(nums[mid]<=target){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
            return left;
        }
    
}