LOWER BOUND
=============
TIME COMPLEXITY-O(LOGN)
SPACE COMPLEXITY-O(1)
---------------------


import java.util.*;
public class LowerBound {
    public int lowerBound(int[] num, int x){
        int low=0;
        int high=num.length-1;
        int ans=num.length;
        while(low<=high){
            int mid=low+high/2;

            if(num[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the element for the array: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the search element: ");
        int x=sc.nextInt();

        LowerBound lb=new LowerBound();
        int result=lb.lowerBound(arr,x);

       System.out.println(result);
        
    }
}