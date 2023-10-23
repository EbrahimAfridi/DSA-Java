package PlayingwithNumbers;

import java.util.Arrays;

public class Prime {

    public static int countPrimes(int n){
        boolean[] arr = new boolean[n + 1];
        arr[0] = false;
        arr[1] = false;

//      filling true in all indexes
        Arrays.fill(arr, true);

        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                count++;
                for (int j = 2 * i; j < n; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++) {
            int num = n % i;
            if (num == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int ans = countPrimes(100);
        System.out.println(ans);
    }
}
