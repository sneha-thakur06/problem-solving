LEADERS IN ARRAY 
----------------
BRUTFORCE SOLUTION:
-------------------
==============================================


import java.util.*;
public class LeaderNumberInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Entre the elements for the array: ");
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean isLeader = true;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                li.add(arr[i]);
            }
        }

        System.out.println(li);

    }
}

==================================================================================

OPTIMAL SOLUTION
----------------
==============================

import java.util.*;
public class LeaderNumberInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Entre the elements for the array: ");
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> li=new ArrayList<>();

          if(arr[i]>max){
               li.add(arr[i]);

           }
            max=Math.max(max,arr[i]);
        }
        System.out.println(li);

    }
}

