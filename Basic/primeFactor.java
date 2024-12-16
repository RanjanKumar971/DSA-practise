public class primeFactor {
    // 1st method
    // public static void printPrimeFactor(int n) {

    // for (int i = 2; i <= n;) {

    // if (isPrime(i)) {
    // if (n % i == 0) {
    // System.out.print(i + " ");
    // n /= i;
    // } else
    // i++;
    // } else if (!isPrime(i))
    // i++;
    // }
    // }

    // public static boolean isPrime(int n) {
    // if (n < 2)
    // return false;
    // if (n == 2 || n == 3)
    // return true;
    // if (n % 2 == 0 || n % 3 == 0)
    // return false;

    // for (int i = 5; i * i <= (n); i += 6)
    // if (n % i == 0 && n % (i + 2) == 0)
    // return false;
    // return true;
    // }

    // 2nd method
    // public static void printPrimeFactor(int n) {
    // if (n <= 1)
    // return;
    // for (int i = 2; i * i <= n; i++) {
    // while (n % i == 0) {
    // System.out.print(i + " ");
    // n /= i;
    // }

    // }
    // if (n > 1)
    // System.out.println(n);
    // }

    // 3rd method
    public static void printPrimeFactor(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n /= (i + 2);
            }

        }
        if (n > 3)
            System.out.println(n);
    }

    public static void main(String[] args) {
        printPrimeFactor(12);
    }

}
