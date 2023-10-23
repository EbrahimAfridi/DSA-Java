package ArrayQues;

import java.util.Arrays;

public class PrefixSum {

    public static int[] arr = {3, 2, 1, 4, 5};

    static int[] prefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(prefixSum(arr)));
    }
}
