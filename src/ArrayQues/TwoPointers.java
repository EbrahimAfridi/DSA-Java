package ArrayQues;

import java.util.Arrays;

public class TwoPointers {
    static int[] arr = {-10, -3, -2, 1, 4, 5};

    static int[] sortZerosAndOnes(int[] arr){
        int s = 0, e = arr.length - 1;

        while (s < e){

            if (arr[s] == 1 && arr[e] == 0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }

            if (arr[s] == 0) {
                s++;
            }

            if (arr[e] == 1) {
                e--;
            }
        }
        return arr;
    }

    static int[] sortEvenOdd(int[] arr){
        int s = 0, e = arr.length - 1;

        while (s < e){

            if (arr[s] % 2 == 1 && arr[e] % 2 == 0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }

            if (arr[s] % 2 == 0) {
                s++;
            }

            if (arr[e] % 2 == 1) {
                e--;
            }
        }
        return arr;
    }

    static int[] sortSquares(int[] arr){
        int s = 0, e = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = arr.length - 1;

        while(s <= e) {
            if(Math.abs(arr[s]) > Math.abs(arr[e])){
                ans[k--] = arr[s] * arr[s];
                s++;
            } else {
                ans[k--] = arr[e] * arr[e];
                e--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] ans = sortZerosAndOnes(arr);
//        int[] ans = sortEvenOdd(arr);
//        int[] ans = sortSquares(arr);
//        System.out.println(Arrays.toString(ans));
    }
}
