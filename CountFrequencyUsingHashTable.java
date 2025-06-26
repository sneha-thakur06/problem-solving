import java.util.Scanner;

public class FrequencyUsingHashTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];
        System.out.println("Enter the element for the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] check=new boolean[s];
        for(int i=0;i<arr.length;i++){
            if(check[i]){
                continue;
            }
            int current=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(current==arr[j]){
                    check[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
}