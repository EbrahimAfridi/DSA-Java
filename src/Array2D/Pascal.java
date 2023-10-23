package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Pascal {

    static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
//          ith row has i + 1 column
            ans[i] = new int[i + 1];
//          1st and last element of all rows are 1
            ans[i][0] = ans[i][i] = 1;
//          rest elements are sum of above two elements
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
