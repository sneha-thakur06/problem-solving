FIND THE NTH ROOT OF THE NUMBER
===============================

USING BINARY SEARCH
--------------------

TIME COMPLEXITY-O(LOG N)
-=======================--


package Project;

import java.util.*;
public class FindTheNthRootOfNumber {

    public static int power(int mid, int p, int num) {
        long result = 1;

        for (int i = 1; i <= p; i++) {
            result = result * mid;

            // early stopping to avoid overflow
            if (result > num) {
                return (int) result;
            }
        }
        return (int) result;
    }
    public static int findNthRoot(int num,int p){

        int low=1;
        int high=num;

        while(low<=high){
            int mid=low+(high-low)/2;

            int res = power(mid, p, num);
            if(res==num){
                return mid;
            }
            else if (res>num) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        System.out.println("Enter the power: ");
        int p=sc.nextInt();

        System.out.println(findNthRoot(num,p));
    }
}
