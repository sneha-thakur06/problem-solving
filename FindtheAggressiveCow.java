FIND AGGRESSIVE COW
=====================

TIME COMPLEXITY-O(LOG N)
------------------------

import java.util.*;
public class AggressiveCow {

    public static int findTheMinDistance(int[] arr, int k){
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        int ans=0;

        while(low<=high){
            int mid=(low+high)/2;

            int count=1;
            int pos=arr[0];
           for(int i=1;i<arr.length;i++){
                if(pos+mid<=arr[i]){
                    count++;
                    pos=arr[i];
                }
           }
           if(count<k){
               high=mid-1;
           }
           else{
               ans=mid;
               low=mid+1;
           }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the number of cows: ");
        int k=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findTheMinDistance(arr,k));

    }
}
