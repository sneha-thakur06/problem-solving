// Move all the zero to the right side using two pointer method (triggered based) 

import java.util.Scanner;

public class MoveAllTheZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        for(int right=0; right<arr.length;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
