//ROTATE THE MATRIX 90 DEGREE 
==============================

BRUTFORCE APPROACH
-----------------

import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row size: ");
        int m=sc.nextInt();

        System.out.println("Enter the value of column size: ");
        int n=sc.nextInt();
        int[][] mat=new int[m][n];

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        int[][] result= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[j][(n-1)-i]=mat[i][j];
            }
        }

        System.out.println("After rotating the array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

}
}


OPTIMISED APPROACH
--------------------



import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row size: ");
        int m=sc.nextInt();

        System.out.println("Enter the value of column size: ");
        int n=sc.nextInt();
        int[][] mat=new int[m][n];

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i< mat.length;i++){
            int left=0; int right=mat[i].length-1;
            while(left < right){
               int temp= mat[i][left];
               mat[i][left]=mat[i][right];
               mat[i][right]=temp;
               left++;
               right--;
            }
        }

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}





