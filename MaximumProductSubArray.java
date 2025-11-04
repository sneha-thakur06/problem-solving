 MAXIMUM PRODUCT SUBARRAY:-
==========================

BRUT FORCE APPROACH
-------------------
TIME COMPLEXITY O(N^3)
SPACE COMPLEXITY O(1)
=======================================================

import java.util.*;
public class MaxProductSubArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int product=1;
                for(int k=i;k<j;k++){
                    product=product*arr[k];
                }
                maxi=Math.max(product,maxi);
            }
        }

        System.out.println(maxi);
    }
}


BETTER APPROACH 
------------------

TIME COMPLEXITY O(N^2)
SPACE COMPLEXITY O(1)
================================

class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod=prod*nums[j];
                maxi=Math.max(maxi,prod);
            }
           
        }
        return maxi;
    }

public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
	
	Solution obj= new Solution();
	
	System.out.println(obj.maxProduct(arr));


      }
}


OPTIMAL SOLUTION
------------------
TIME COMPLEXITY - O(N)
SPACE COMPLEXITY - O(1)
===========================

import java.util.*;

import static java.lang.Math.max;

public class MaxProductSubArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int prefix=1;
        int suffix=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){

            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }

            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            maxi= Math.max(maxi,max(prefix,suffix));

            
        }


        System.out.println(maxi);
    }
}
