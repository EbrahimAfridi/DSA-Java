package ArrayQues;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arr = {1, 2, 3,  4, 5};

    public static int[] reverse(int[] arr, int s, int e){
//        int s = 0, e = arr.length - 1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s = s + 1;
            e = e - 1;
        }
        return arr;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int biggestNum(int[] arr){
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big){
                big = arr[i];
            }
        }
        return big;
    }

    public static int search(int[] arr, int x){
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int occurrenceOfNum(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        return count;
    }

    public static int lastOccurrenceOfNum(int[] arr, int x){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    public static int biggerThanNum(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) count++;
        }
        return count;
    }

    public static boolean sortedOrNot(int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return flag;
    }

    public static int[] smallestAndLargestNums(int[] arr){
        int[] Array = new int[2];
        int big = arr[0];
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) big = arr[i];
            if (arr[i] < small) small = arr[i];
        }
        Array[0] = small;
        Array[1] = big;
        return Array;
    }

    public static int[] rotateKSteps(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static int[] rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);     // rotates 1st part
        reverse(arr, n-k, n-1);     // rotates 2nd part
        reverse(arr, 0, n-1);       // rotates both parts
        return arr;
    }

    public static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
/*      int[] ans = reverse(arr);
        int sumOfArr = sum(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(sumOfArr);
        int big = biggestNum(arr);
        System.out.println(big);
        int searchNum = search(arr, 5);
        System.out.println(searchNum);
        int occurrence = occurrenceOfNum(arr, 1);
        System.out.println(occurrence);
        int lastNum = lastOccurrenceOfNum(arr, 2);
        System.out.println(lastNum);
        int bigThanNum = biggerThanNum(arr, 2);
        System.out.println(bigThanNum);
        boolean arrSorted = sortedOrNot(arr);
        System.out.println(arrSorted);
        int[] ansArray = smallestAndLargestNums(arr);
        System.out.println(Arrays.toString(ansArray));
        System.out.println(Arrays.toString(rotateKSteps(arr, 13)));
        System.out.println(Arrays.toString(rotateInPlace(arr, 3)));
*/

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.print("Enter " + n + " elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int[] freq = makeFrequencyArray(arr);
//
//        System.out.print("Enter number of queries: ");
//        int q = sc.nextInt();
//
//        while(q > 0){
//            System.out.print("Enter number to be searched: ");
//            int num = sc.nextInt();
//            if (freq[num] > 0){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//            q--;
//        }
    }

}
