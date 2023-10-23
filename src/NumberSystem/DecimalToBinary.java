package NumberSystem;
import java.util.Scanner;

class Converter {
    public String toBinary(int decimal){
        String res = "";
        
        while(decimal != 0){
            int lastBit = decimal & 1;
            res = lastBit + res;
            decimal = decimal >> 1;
        }
        return res;
    }

    public int toDecimal(int binary){
        int res = 0;
        int index = 0;
        while(binary != 0){
            int lastDigit = binary % 10;
            if(lastDigit == 1){
                res = res + (int) Math.pow(2, index);
            }
            index = index + 1;
            binary = binary / 10;
        }
        return res;
    }
}


public class DecimalToBinary {
    public static void main(String[] args) {
//        input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
//        int num = sc.nextInt();
//        String res = "";
//
////        algorithm
//        while(num > 0){
//            int rem = num % 2;
//            num = num / 2;
//            res = rem + res;
//        }
//        System.out.println(res);
//        boolean ans = evenOdd(21);
//        System.out.println(ans);

        Converter converter = new Converter();
//        System.out.println(converter.toBinary(11));
        System.out.println(converter.toDecimal(1011));
    }

//    public static boolean evenOdd(int n){
//        if ((n & 1) == 0) {
//            return true;
//        }else{
//            return false;
//        }
//    }
}
