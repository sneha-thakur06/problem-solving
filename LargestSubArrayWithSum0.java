LONGEST SUBARRAY WITH SUM ZERO 
==============================

 NAIVE APPROACH
----------------

TIME COMPLEXITY - O(N^2)
SPACE COMPLEXIITY - O(1)
========================

import java.util.*;
public class LargestSubarrayWithSum0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the element for the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){

                    sum+=arr[j];
                    if(sum==0){
                        maxi=Math.max(maxi,j-i+1);
                }
            }
        }
        System.out.println(maxi);
    }
}


