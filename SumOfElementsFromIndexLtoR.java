//SUM OF ELEMENT FROM INDEX L TO R
===================================

TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:-O(1)
======================

import java.util.*;
public class SumOfElementsFromIndexLtoR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the L index number: ");
        int l=sc.nextInt();

        System.out.println("Enter the R index number: ");
        int r=sc.nextInt();

        int[] temp= new int[size];
        temp[0]=arr[0];
        for(int j=1;j<arr.length;j++){
            if(j>=l && j<=r){
                temp[j]=arr[j]+temp[j-1];
            }
            else{
                temp[j]=arr[j];
            }
        }

        for(int num:temp){
            System.out.print(num+" ");
        }
    }
}
