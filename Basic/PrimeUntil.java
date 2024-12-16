// import java.util.Collections;
// import java.util.Vector;

public class PrimeUntil {
    // public static void sieve(int n) {
    // Vector<Boolean>[] isPrime = new Vector<>()[n+1];
    // Collections.fill(isPrime, true);
    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i)) {
    // System.out.print(i + " ");
    // for (int j = i * i; j <= n; j = j + i)
    // isPrime[j] = false;
    // }

    // }

    // }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= (n); i += 6)
            if (n % i == 0 && n % (i + 2) == 0)
                return false;
        return true;
    }

}
