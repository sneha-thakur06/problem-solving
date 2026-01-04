FIND THE SQUARE ROOT OF A NUMBER
==================================

USING BRUTFORCE APPROACH
========================

TIME COMPLEXITY-O(N)
----------------------
import java.util.*;
public class FindTheSquareOfAnInteger {

    public static int theSquareOfAnInteger(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(theSquareOfAnInteger(n));
        

    }
}


USING BINARY SEARCH
--------------------

TIME COMPLEXITY -O(LOG N)
-------------------------

import java.util.*;
public class FindTheSquareOfAnInteger {

    public static int usingBinarySearch(int n){
        int ans=0;
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(usingBinarySearch(n));

    }
}
