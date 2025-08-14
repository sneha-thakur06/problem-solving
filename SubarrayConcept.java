//Creation of the subarray

import java.util.*;
public class SubarrayCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element for the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Subarrays are: ");
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=i;j<n;j++){
                li.add(arr[j]);
                System.out.println(li);
            }
        }
    }
}


             //MAXIMUM SUBARRAY SUM
-------------------==============-----------------
BRUTFORCE APPROACH
==================

------------------------
TIME COMPLEXITY --0(N^2)
SPACE COMPLEXITY -- 0(1)
------------------------


import java.util.*;
public class SubarrayCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element for the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Subarrays are: ");
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    maxSum=Math.max(maxSum,sum);
                }

            }
        }
        System.out.println(maxSum);
    }
}



BETTER APPROACH
================

------------------------
(TIME COMPLEXITY 0(N^2))
(SPACE COMPLEXITY 0(1))
------------------------


import java.util.*;
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("The maximum sum is: "+maxsum);
    }
}


OPTIMAL APPROACH (USING Kadane's Algorithm)
-----------------------
TIME COMPLEXITY----O(N)
SPACE COMPLEXITY---O(1)
-----------------------


import java.util.Scanner;

public class MaximumSubArraySumExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements for the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }
}




