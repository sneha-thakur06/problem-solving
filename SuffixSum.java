import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] suffix=new int[size];
        suffix[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
           suffix[i]=arr[i]+suffix[i+1];
        }

        System.out.println("Prefix array is: ");
        for(int k:suffix){
            System.out.print(k+" ");
        }

    }
}
