import java.math.BigInteger;

public class Ch01Ex06 {
    public static void main(String[] args) {
        System.out.printf("factorail1000=%s\n", factorial(1000).toString());
    }


    public static BigInteger factorial(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }
        else{
            return BigInteger.valueOf((long)n).multiply(factorial(n-1));
        }


    }
}
