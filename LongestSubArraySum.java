
//LONGEST SUBARRAY SUM
========================

BRUTFORCE APPROACH
==================
TIME COMPLEXITY - O(N^3)
SPACE COMPLEXITY- O(1)
===========================

import java.util.*;
public class LongestSubArraySum {

    public static int longestSubArray(int[] arr){
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
  
            for(int j=i;j<arr.length;j++){
 		int sum=0;
		for(int k=i;k<=j;k++){
			sum+=arr[k];

		}

                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s=sc.nextInt();

        int[] arr= new int[s];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(longestSubArray(arr));

    }
}


//BETTER APPROACH
================

TIME COMPLEXITY - O(N^2)
SPACE COMPLEXITY- O(1)
===========================

import java.util.*;
public class LongestSubArraySum {

    public static int longestSubArray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s=sc.nextInt();

        int[] arr= new int[s];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(longestSubArray(arr));

    }
}




//USING KEDEN'S ALGORITHM
==========================

TIME COMPLEXITY -- O(N)
SPACE COMPLEXITY -- O(1)

===============================

import java.util.*;
public class KedensAlgorithm {

    public static int longestSubarraySum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();


        int[] arr=new int[size];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestSubarraySum(arr));
    }
}

