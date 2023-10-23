package ArrayQues;

import java.util.Arrays;
import java.util.Scanner;

public class RangeQueryPrefixSum {

    static int[] prefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefArr = prefixSum(arr);
        System.out.println(Arrays.toString(prefArr));

        System.out.print("Enter the number of queries you want: ");
        int queries = sc.nextInt();

        while(queries-- > 0){
            System.out.print("Enter range l: ");
            int l = sc.nextInt();
            System.out.print("Enter range r: ");
            int r = sc.nextInt();

            int ans = prefArr[r] - prefArr[l - 1];
            System.out.println("Sum: " + ans);
        }

    }

}
