package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix { 
    
    static void findInplaceTransposeMatrix(int[][] matrix, int r, int c) {
        int temp;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void Rotate(int[][] matrix, int n){
        // transpose
        findInplaceTransposeMatrix(matrix, n, n);

        // reverse each row of transpose matrix
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows and columns ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalValues = r * c;

        System.out.println("Enter " + totalValues + "values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Rotate(matrix, r);

        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
