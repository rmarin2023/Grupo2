package Transpuesta;

import java.util.Scanner;

public class adrian_Transpuesta {
    
        static final int N=4;
    
   
    static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }
 
    public static void main(String[] args) {
        int A[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
 
        int B[][] = new int[N][N], i, j;
        System.out.println("Transpuesta de una matriz:\n");
 
        System.out.println("\nAntes de  Transponer:");
 
        Mostrar(A);
 
        transpose(A, B);
 
        System.out.println("\nDespués de  Transponer:");
        Mostrar(B);
    }
 
    private static void Mostrar(int[][] b) {
        int i;
        int j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
    }
}



