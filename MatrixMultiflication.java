// Write a Program to multiple two (n*n) Matrices? Explain logic on how you would do it. 
// Ans-  It follows the row of first * column of second rule .
// If we have two matrices
// A=[1  2]     B=[1   2]
//   [3  4]       [3   4]
// Then we calculate it as . C=[(1*1)+ (2*3)   (1*2)+(2*4)]
// 			          [(3*1)+(4*3)    (3*2)+(4*4)]



import java.util.Scanner;
public class MatrixMultiflication{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //Declaration of matrices
        int[][]A= new int [n][n];
        int[][]B= new int [n][n];
        int[][]C= new int [n][n];
        //input first matrix
         System.out.println("Input 1 st Matrix:");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=s.nextInt();
            }
        }
        //input second matrix
        System.out.println("Input 2 nd Matrix:");
         for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                B[i][j]=s.nextInt();
            }
        }
        // multiflication of matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j]=0;
                for(int k=0;k<n;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
         System.out.println("Multiflication of matrix:");
          for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
