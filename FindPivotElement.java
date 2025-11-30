//PIVOT ELEMENT IN AN ARRAY
===========================

import java.util.*;
public class PivotElement {

    public static int findPivotElement(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            int rightSum=sum-leftSum-arr[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the element");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findPivotElement(arr));

    }
}
