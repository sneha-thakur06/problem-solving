BRUTFORCE APPROCH
=================

TIME COMPLEXITY- O(N)* O(2N) -- O(N^2)
SPACE COMPLEXITY- O(1)
=====================================


import java.util.Scanner;

public class DivideArrayIntoTwoParts {
    public static int divideArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int sum1=0;
            int sum2=0;

            for(int j=0;j<=i;j++){
                sum1+=arr[j];
            }

            for(int j=i+1;j<arr.length;j++){
                sum2+=arr[j];
            }

            if(sum1==sum2){
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the element for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(divideArray(arr));
    }

}
