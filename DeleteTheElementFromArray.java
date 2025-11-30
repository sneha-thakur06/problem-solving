ONE APPROACH
=============

import java .util.*;
public class DeleteByIndexing {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index value....");
        int k=sc.nextInt();
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(i==k){
                continue;
            }
            else{
                arr[t]=arr[i];
                t++;
            }
        }

       

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}




SECOND APPROACH
================

import java .util.*;
public class DeleteByIndexing {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index value....");
        int k=sc.nextInt();

        for(int i=k;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


