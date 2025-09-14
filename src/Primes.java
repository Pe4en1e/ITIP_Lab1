import java.math.BigInteger;

public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        return new BigInteger(String.valueOf(n)).isProbablePrime(100);
    }
}
