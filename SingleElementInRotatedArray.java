SINGLE ELEMENT IN A SORTED ARRAY
================================

BRUT FORCE PPROACH
-------------------
TIME COMPLEXITY-O(N)

public class SingleEmelent{

	public static void main(String[] args){
		Scanner sc=new Scnnaer(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the element of the array");
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(i==0 && arr[i]!=arr[i+1]){
				ans=arr[i];
				}
			if(i==arr.length-1 && arr[i]!=arr[i-1]){
				ans=arr[i];
				}
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){

				ans=arr[i];
				}
			
			}

		System.out.println(ans);
	}

}



OPTIMAL APPROACH
==================

USING BINARY SEARCH
===================

TIME COMPLEXITY-O(LOG N)
------------------------

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
       
        if(nums.length==1){
            return nums[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(mid==0 && nums[0]!=nums[1]){
               
                    return nums[mid];
                
            }

            if(mid==nums.length-1 && nums[mid]!=nums[mid-1]){
            
                    return nums[mid];
                
            }


            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
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