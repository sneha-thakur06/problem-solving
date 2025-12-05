//TRAPPING RAIN WATER
========================

BRUT FORCE APPROACH
---------------------
TIME COMPLEXITY- O(N^2)
SPACE COMPLEXITY- O(1)


import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the element for the array: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        int water=0;

        for(int i=0;i<arr.length;i++){
            int leftmax=0;
            int rightmax=0;
            for(int j=0;j<=i;j++){
                leftmax=Math.max(leftmax,arr[j]);
            }

            for(int k=i+1;k<arr.length;k++){
                rightmax=Math.max(rightmax,arr[k]);
            }
            int min=Math.min(leftmax,rightmax);
            int dif=min-arr[i];
            if(dif>0){
                water+=dif;
            }
        }
        System.out.println(water);
}
}



//BETTER APPROACH
==================

TIME COMPLEXITY-O(N)
SPACE COMPLEXITY-O(N)

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the element for the array: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
	
	  //Better approach

       int[] leftMax=new int[size];
        int[] rightMax = new int[size];


        leftMax[0]=0;
        for(int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i-1]);
        }

        rightMax[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i+1]);
        }

        //total water
        int sum=0;

        for(int i=0;i<arr.length;i++){
            int minvalue=Math.min(leftMax[i],rightMax[i]);
            int val=minvalue-arr[i];
            if(val>0){
                sum+=val;
            }
        }
        System.out.println(sum);

}
}


OPTIMAL APPRACH
====================

TIME COMPLEXITY-O(N)
SPACE COMPLEXITY-O(1)

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the element for the array: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
	



//        //Step-1 - find out the max height building and store its index value
//        int buildingMax=arr[0];
//        int ind=0;
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>buildingMax){
//                buildingMax=arr[i];
//                ind=i;
//
//            }
//        }
//        int leftMax=0;
//        int water=0;
//        for(int i=0;i<=ind;i++){
//            if(leftMax > arr[i]){
//                water+=leftMax-arr[i];
//            }
//
//            else{
//                leftMax=arr[i];
//            }
//        }
//        int rightmax=0;
//        for(int i=arr.length-1;i>ind;i--){
//            if(rightmax> arr[i]){
//                water+=rightmax-arr[i];
//            }
//            else{
//                rightmax=arr[i];
//            }
//        }
//
//        System.out.println(water);

