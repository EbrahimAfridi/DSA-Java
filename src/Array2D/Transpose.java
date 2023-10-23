package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {

    static int[][] findTransposeMatrix(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
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

//        Print Matrix
//        for (int i = 0; i < r; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

        int[][] ans = findTransposeMatrix(matrix, r, c);

        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
