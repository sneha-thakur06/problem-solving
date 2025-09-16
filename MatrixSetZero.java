import java.util.*;
public class MatrixSetZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int m=sc.nextInt();

        System.out.println("Enter the column size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements for the configuration: ");
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        boolean[] zrow=new boolean[m];
        boolean[] zcol=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                 zrow[i]=true;
                 zcol[j]=true;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(zrow[i] || zcol[j]){
                    arr[i][j]=0;
                }
            }
        }

        System.out.println("The matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
