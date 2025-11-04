 COUNT THE NUMBER OF SUBAARYA WITH GIVE XOR K
==============================================

TIME COMPLEXITY - O(N^3)
SPACE COMPLEXITY -  O(1)
===============================


import java.util.*;
public class CountTheSubArrayMatchWithGivenXOR {

    public static int numberOfSubArrayBrutForce(int[] arr, int v){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xr=0;
                for(int k=i;k<=j;k++){
                    xr=xr^arr[k];

                }
                if(xr==v){
                    count++;
                }
            }
        }
        return count;
    }
=======================================================

TIME COMPLEXITY - O(N^2)
SPACE COMPLEXITY -  O(1)
===============================

    public static int numberOfSubArrayBetter(int[] arr, int v){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int xr=0;
            for(int j=i;j<n;j++){
                xr=xr^arr[j];
                if(xr==v){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value for the xor");
        int v=sc.nextInt();

        System.out.println(numberOfSubArrayBrutForce(arr,v));

        System.out.println(numberOfSubArrayBetter(arr,v));

    }
}
