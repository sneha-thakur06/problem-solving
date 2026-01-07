//FIND THE KTH MISSING VALUE IN THE ARRAY
=========================================

TIME COMPLEXITY-O(N^2)

SPACE COMPLEXITY=O(1)
=========================

package Project;

import java.util.*;
public class FindMissingKthElement {

    public static int missingValue(int[] arr,int k){

        int count=0;

        int num=1;
        while(true){
            boolean check=false;
            for (int value : arr) {
                if (num == value) {

                    check=true;
                    break;
                }
            }
            if(!check){
                count++;
                if(count==k){
                    return num;
                }
            }
            num=num+1;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth value: ");
        int k=sc.nextInt();

        System.out.println(missingValue(arr,k));
    }
}






OPTIMAL APPROACH
=================

TIME COMPLEXITY-O(LOG N)
SPACE COMPLEXITY-O(1)
============================

import java.util.*;
public class FindMissingKthElement {

    public static int missingUsingBinarySearch(int[] arr, int k){
        int low=0;
        int n=arr.length;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int num=arr[mid]-(mid+1);
            if(num<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth value: ");
        int k=sc.nextInt();

        System.out.println(missingUsingBinarySearch(arr,k));
    }

}
