

FIND THE SMALLEST DIVISOR GIVEN A THRESHOLD VALUE
===================================================

BRUTFORCE APPROACH
-------------------

TIME COMPLEXITY- O(N*M)
=========================

import java.util.*;


public class FindTheSmallestDivisorGivenAThreshold {

    public static int smallestDivisor(int[] arr, int threshold){

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += (arr[j] + i - 1) / i; // ceil division
            }

            if (sum <= threshold) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the threshold value: ");
        int threshold=sc.nextInt();

       System.out.println(smallestDivisor(arr,threshold));
        
    }
}




OPTIMAL APPROACH USING BINARY SEARCH
=====================================

TIME COMPLEXITY-O(N LOG N)

import java.util.*;


public class FindTheSmallestDivisorGivenAThreshold {


    private static int maximumElement(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }

        return maxi;
    }

    private static int searching(int[] arr, int div){
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum= sum+ (((arr[j]+div-1) / (div)));
        }

        return sum;
    }

    public static int usingBinarySearch(int[] arr, int threshold){

        int low=1;
        int high=maximumElement(arr);
        while(low<=high){
            int mid=(low+high)/2;


            if(searching(arr,mid)<=threshold){
                high=mid-1;
            }
            else{
               low=mid+1;

            }

        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the threshold value: ");
        int threshold=sc.nextInt();


        System.out.println(usingBinarySearch(arr,threshold));
    }
}


