package Rescursion;

public class PrintRec {

    public static int recCall(int n){
        if(n < 1) return 1;  // Base Case
        System.out.print(n + " ");
        return recCall(n - 1);
    }

    public static void main(String[] args) {
        recCall(5);
    }
}
