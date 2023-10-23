package Rescursion;

public class PowerofX {

    public static int power(int n, int x){
        if(x == 0) return 1;  // Base Case
        if(x == 1) return n;  // Base Case

        return n * power(n, x - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(5,5));
    }
}
