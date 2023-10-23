package ArrayQues;

import java.util.Scanner;

public class EqualSumPossible {

    static int totalSum(int[] arr){

        int totalSum = 0;

        for (int j : arr) {

            totalSum += j;

        }

        return totalSum;

    }

    static boolean equalSumPossible(int[] arr){

        int totalSum = totalSum(arr);

        int prefSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefSum += arr[i];

            int sufSum = totalSum - prefSum;

            if (prefSum == sufSum) return true;

        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition: " + equalSumPossible(arr));

    }

}
