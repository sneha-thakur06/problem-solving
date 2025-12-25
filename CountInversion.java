//COUNT INVERSION
=======================

BRUT FORCE APPROACH
-----------------------


TIME COMPLEXITY-O(n^2)
SPACE COMPLEXITY-O(1)
=======================



package Project;
import java.util.*;
public class CountInversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


OPTIMAL APPROACH
-------------------
TIME COMPLEXITY-O(n log n)
SPACE COMPLEXITY-O(n)
============================


package Project;
import java.util.*;

//Using merge sort
public class CountInversion {

    public static int mergeSort(int[] arr, int left, int right){
        if(left>=right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int count=mergeSort(arr,left,mid)+
        mergeSort(arr,mid+1,right)+
           inversion(arr,left, mid,right);

        merge(arr,left,mid,right);

        return count;
    }

    private static int inversion(int[] arr, int left,int mid, int right){
        int i=left;
        int j=mid+1;
        int count=0;
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                count += (mid - i + 1);
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] temp=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){

                temp[k++]=arr[i++];

        }
        while(j<=right){

                temp[k++]=arr[j++];

        }

        for(int p=left;p<=right;p++){
            arr[p]=temp[p-left];
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result=mergeSort(arr,0,arr.length-1);

        System.out.println("The result is: "+result);
    }
}

